package FirstTask;

class Model extends MobilePhone {
    private final String operatingSystem;

    public Model(String brand, String model, int batteryLife, String operatingSystem) {
        super(brand, model, batteryLife);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Battery Life: " + getBatteryLife() + "%");
        System.out.println("Operating System: " + getOperatingSystem());
    }
}
