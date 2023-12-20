import java.util.Scanner;

public class SecondTask {
    public static double celsiusToFahrenheit (double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static double celsiusToKelvin (double celsius) {
        return celsius + 273.16;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);

        System.out.println("Celsius " + celsius);
        System.out.println("Fahrenheit " + fahrenheit);
        System.out.println("Kelvin " + kelvin);
    }


}
