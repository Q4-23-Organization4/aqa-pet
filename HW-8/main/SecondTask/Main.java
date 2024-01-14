package SecondTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + Calculator.add(5, 3));
        System.out.println("5 - 3 = " + Calculator.subtract(5, 3));
        System.out.println("5 * 3 = " + Calculator.multiply(5, 3));
        System.out.println("5 / 3 = " + Calculator.divide(5, 3));

        System.out.println("5 / 0 = " + Calculator.divide(5, 0));
    }
}
