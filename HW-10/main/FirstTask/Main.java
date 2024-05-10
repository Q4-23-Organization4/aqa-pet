package FirstTask;

public class Main {
    public static void main(String[] args) {
        Model myPhone = new Model("BrandX", "ModelY", 100, "Android");
        myPhone.displayInfo();
        myPhone.makeCall("123-456-7890");
        myPhone.sendMessage("123-456-7890", "Hello, this is a test message!");
        myPhone.chargeBattery(20);
    }
}
