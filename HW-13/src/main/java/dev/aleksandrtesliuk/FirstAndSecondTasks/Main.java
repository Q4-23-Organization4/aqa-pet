package dev.aleksandrtesliuk.FirstAndSecondTasks;


public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
                new Book("The Great Gatsby"),
                new Magazine("National Geographic"),
                new Book("1984"),
                new Magazine("Time")
        };

        // Lambda expression for interface Printable
        Printable lambdaPrintable = () -> System.out.println("This is a lambda printable!");

        // Calling a Lambda Expression
        lambdaPrintable.print();

        System.out.println("\nOriginal Printables:");
        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println("\nMagazines:");
        Magazine.printMagazines(printables);

        System.out.println("\nBooks:");
        Book.printBooks(printables);
    }
}
