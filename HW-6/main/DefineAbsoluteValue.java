import java.util.Scanner;

public class DefineAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);

        if (absNumber1 == absNumber2) {
            System.out.println("Numbers " + number1 + " and " + number2 + " have equal absolute values.");
        } else if (absNumber1 > absNumber2) {
            System.out.println("Number " + number1 + " has a greater absolute value than " + number2 + ".");
        } else {
            System.out.println("Number " + number2 + " has a greater absolute value than " + number1 + ".");
        }
    }
}

