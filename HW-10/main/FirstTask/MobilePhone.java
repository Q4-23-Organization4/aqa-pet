package FirstTask;

abstract class MobilePhone implements Mobile {
    private final String brand;
    private final String model;
    private int batteryLife;

    public MobilePhone(String brand, String model, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void chargeBattery(int amount) {
        batteryLife += amount;
        System.out.println("Battery charged. Current battery life: " + batteryLife + "%");
    }

    @Override
    public void makeCall(String number) {
        if (batteryLife > 0) {
            System.out.println("Calling " + number + "...");
            batteryLife -= 5;
        } else {
            System.out.println("Battery is dead. Please charge your phone.");
        }
    }

    @Override
    public void sendMessage(String number, String message) {
        if (batteryLife > 0) {
            System.out.println("Sending message to " + number + ": " + message);
            batteryLife -= 2;
        } else {
            System.out.println("Battery is dead. Please charge your phone.");
        }
    }

    @Override
    public abstract String getOperatingSystem();
}
