public class ThirdTask {
    public static double calculateArea (double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 5.0;
        double height = 3.0;

        double area = calculateArea(base, height);
        System.out.println("Area of a right triangle: " + area);
    }
}
