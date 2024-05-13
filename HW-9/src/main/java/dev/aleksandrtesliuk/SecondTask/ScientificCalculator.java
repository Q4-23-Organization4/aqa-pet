package dev.aleksandrtesliuk.SecondTask;

class ScientificCalculator extends Calculator {
    @Override
    public void specificFunction() {
        System.out.println("Scientific Calculator: Performing sine function.");
    }

    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }
}
