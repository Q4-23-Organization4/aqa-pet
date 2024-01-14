package FirstTask;
public class TestUser {
    public static void main(String[] args) {
        User user1 = new User("Alice", "password123");
        User user2 = new User("Bob");
        User user3 = new User("Alex");

        user1.setAge(25);
        user1.email = "alice@example.com";

        user1.makePurchase(100.0);
        user1.makePurchase(50.5);
        user2.makePurchase(200.0);

        user1.printTotalAmountOfSpentMoney();
        user2.printTotalAmountOfSpentMoney();
        user3.printTotalAmountOfSpentMoney();

        user1.printUserInfo();
        user2.printUserInfo();
        user3.printUserInfo();
    }
}
