package dev.aleksandrtesliuk;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class UTestUserMethods {
    private List<User> users;

    @BeforeMethod
    public void setUp() {
        users = Arrays.asList(
                new User("John", "Smith", 25),
                new User("Alice", "Johnson", 30),
                new User("Bob", "Brown", 20),
                new User("Charlie", "Davis", 35),
                new User("Eve", "Adams", 28),
                new User("Grace", "Anderson", 40),
                new User("Hank", "Scott", 18),
                new User("Ivy", "Williams", 17),
                new User("Jack", "Miller", 19),
                new User("Karen", "Taylor", 45)
        );
    }

    @AfterMethod
    public void tearDown() {
        users = null;
    }

    @Test
    public void testSortUsersByAge() {
        List<User> sortedUsers = UserMethods.sortUsersByAge(users);
        Assert.assertEquals(sortedUsers.get(0).getAge(), 17);
        Assert.assertEquals(sortedUsers.get(1).getAge(), 18);
    }

    @Test
    public void testSortUsersByAge_SecondTest() {
        List<User> sortedUsers = UserMethods.sortUsersByAge(users);
        Assert.assertEquals(sortedUsers.get(sortedUsers.size() - 1).getAge(), 45);
        Assert.assertEquals(sortedUsers.get(sortedUsers.size() - 2).getAge(), 40);
    }

    @Test
    public void testSortUsersByAge_EmptyList() {
        List<User> emptyList = UserMethods.sortUsersByAge(List.of());
        Assert.assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testCalculateAverageAge() {
        double averageAge = UserMethods.calculateAverageAge(users);
        Assert.assertEquals(averageAge, 27.7, 0.1);
    }

    @Test
    public void testCalculateAverageAge_SecondTest() {
        double averageAge = UserMethods.calculateAverageAge(users);
        Assert.assertTrue(averageAge > 0);
    }

    @Test
    public void testCalculateAverageAge_EmptyList() {
        double averageAge = UserMethods.calculateAverageAge(List.of());
        Assert.assertEquals(averageAge, 0.0);
    }

    @Test
    public void testSortUsersByFirstNameAndAge() {
        List<User> sortedUsers = UserMethods.sortUsersByFirstNameAndAge(users);
        Assert.assertEquals(sortedUsers.get(0).getFirstName(), "Alice");
        Assert.assertEquals(sortedUsers.get(1).getFirstName(), "Bob");
    }

    @Test
    public void testSortUsersByFirstNameAndAge_SecondTest() {
        List<User> sortedUsers = UserMethods.sortUsersByFirstNameAndAge(users);
        Assert.assertEquals(sortedUsers.get(sortedUsers.size() - 1).getFirstName(), "Karen");
    }

    @Test
    public void testSortUsersByFirstNameAndAge_EmptyList() {
        List<User> emptyList = UserMethods.sortUsersByFirstNameAndAge(List.of());
        Assert.assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testCheckUsersWithSpecificLastNames() {
        boolean hasSpecificLastNames = UserMethods.checkUsersWithSpecificLastNames(users);
        Assert.assertTrue(hasSpecificLastNames);
    }

    @Test
    public void testCheckUsersWithSpecificLastNames_SecondTest() {
        List<User> testUsers = Arrays.asList(
                new User("Sam", "Adams", 32),
                new User("Anna", "Smith", 24)
        );
        boolean hasSpecificLastNames = UserMethods.checkUsersWithSpecificLastNames(testUsers);
        Assert.assertTrue(hasSpecificLastNames);
    }

    @Test
    public void testCheckUsersWithSpecificLastNames_InvalidInput() {
        List<User> invalidUsers = null;
        boolean result;
        try {
            result = UserMethods.checkUsersWithSpecificLastNames(invalidUsers);
        } catch (IllegalArgumentException e) {
            result = true;
        }
        Assert.assertTrue(result, "Expected IllegalArgumentException for null user list");
    }

    @Test
    public void testCheckAllUsersOlderThan18() {
        boolean allOlderThan18 = UserMethods.checkAllUsersOlderThan18(users);
        Assert.assertFalse(allOlderThan18);
    }

    @Test
    public void testCheckAllUsersOlderThan18_SecondTest() {
        List<User> testUsers = Arrays.asList(
                new User("John", "Smith", 25),
                new User("Alice", "Johnson", 19)
        );
        boolean allOlderThan18 = UserMethods.checkAllUsersOlderThan18(testUsers);
        Assert.assertTrue(allOlderThan18);
    }

    @Test(dataProvider = "userProvider")
    public void testCheckAllUsersOlderThan18_DataProvider(List<User> testUsers, boolean expectedResult) {
        boolean result = UserMethods.checkAllUsersOlderThan18(testUsers);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "userProvider")
    public Object[][] userProvider() {
        return new Object[][]{
                {Arrays.asList(
                        new User("John", "Smith", 25),
                        new User("Alice", "Johnson", 30)
                ), true},
                {Arrays.asList(
                        new User("John", "Smith", 25),
                        new User("Alice", "Johnson", 17)
                ), false}
        };
    }
}
