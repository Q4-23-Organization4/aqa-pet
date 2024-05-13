package dev.aleksandrtesliuk.SecondTask;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator basic = new BasicCalculator();
        System.out.println("Basic Calculator:");
        System.out.println("Add: " + basic.add(10, 5));
        System.out.println("Subtract: " + basic.subtract(10, 5));
        basic.specificFunction();
        System.out.println();

        ScientificCalculator scientific = new ScientificCalculator();
        System.out.println("Scientific Calculator:");
        System.out.println("Multiply: " + scientific.multiply(10, 5));
        System.out.println("Divide: " + scientific.divide(10, 5));
        System.out.println("Sine(30): " + scientific.sine(30));
        scientific.specificFunction();
        System.out.println();

        ProgrammerCalculator programmer = new ProgrammerCalculator();
        System.out.println("Programmer Calculator:");
        System.out.println("Binary of 10: " + programmer.toBinary(10));
        programmer.specificFunction();
    }
}