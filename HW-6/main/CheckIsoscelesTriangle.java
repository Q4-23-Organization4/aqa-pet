import java.util.Scanner;

public class CheckIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the value of the second side: ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the value of the third side: ");
        double side3 = scanner.nextDouble();

        if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
