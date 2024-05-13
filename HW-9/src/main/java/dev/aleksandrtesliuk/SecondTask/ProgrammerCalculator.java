package dev.aleksandrtesliuk.SecondTask;

class ProgrammerCalculator extends Calculator {
    @Override
    public void specificFunction() {
        System.out.println("Programmer Calculator: Performing binary conversion.");
    }

    public String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
