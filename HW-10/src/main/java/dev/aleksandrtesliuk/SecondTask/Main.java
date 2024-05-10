package dev.aleksandrtesliuk.SecondTask;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
                new Book("The Great Gatsby"),
                new Magazine("National Geographic"),
                new Book("1984"),
                new Magazine("Time")
        };

        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println("\nMagazines:");
        Magazine.printMagazines(printables);

        System.out.println("\nBooks:");
        Book.printBooks(printables);
    }
}
