package FirstTask;

public class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {
        email = "";
        isActive = true;
    }

    public User(String userName) {
        this();
        this.userName = userName;
    }

    public User(String userName, String password) {
        this(userName);
        setPassword(password);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
    }

    public void makePurchase(double purchasePrice) {
        if (purchasePrice > 0) {
            this.amountSpentMoney += purchasePrice;
            System.out.println(userName + " - Purchase with sum:: " + purchasePrice);
        }
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println(userName + " - Total amount of spent money: " + this.amountSpentMoney);
    }

    public void printUserInfo() {
        System.out.printf("User's name: %s, Age: %d, Email: %s, Active: %b, Money spent: %.2f\n",
                userName, age, email, isActive, amountSpentMoney);
    }
}
