package dev.aleksandrtesliuk.SecondTask;

public class Main {
    public static void main(String[] args) {

        int X = 50;
        Partitioner manager = new Partitioner(X);

        manager.fillList();
        System.out.println("Original list:");
        manager.printList();

        manager.rearrangeList();
        System.out.println("Rearranged list:");
        manager.printList();
    }
}
