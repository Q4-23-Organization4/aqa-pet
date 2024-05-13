package dev.aleksandrtesliuk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    private static final By USERNAME_FIELD = By.xpath("//input[@id='username']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@class='radius' and @type='submit']");
    private static final By SUCCESS_MESSAGE = By.xpath("//div[@id='flash' and contains(text(), 'You logged into a secure area!')]");
    private static final By LOGOUT_BUTTON = By.xpath("//a[@class='button secondary radius' and @href='/logout']");
    private static final By ERROR_MESSAGE = By.xpath("//div[@id='flash' and contains(text(), 'Your username is invalid!')]");

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void validLoginTest() {

        WebElement usernameField = driver.findElement(USERNAME_FIELD);
        usernameField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed");

        WebElement logoutButton = driver.findElement(LOGOUT_BUTTON);
        logoutButton.click();
    }

    @Test
    public void invalidLoginTest() {

        WebElement usernameField = driver.findElement(USERNAME_FIELD);
        usernameField.sendKeys("tosmith");

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys("SuperSecretPassword");

        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(ERROR_MESSAGE));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


