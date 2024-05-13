package dev.aleksandrtesliuk.FirstTask;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DuplicateRemover collection = new DuplicateRemover(100, -20, 20);
        List<Integer> originalNumbers = collection.getNumbers();
        System.out.println("Original collection: " + originalNumbers);

        List<Integer> uniqueNumbers = collection.removeDuplicates();
        System.out.println("Collection without duplicates: " + uniqueNumbers);

        int removedCount = collection.countRemovedDuplicates(uniqueNumbers);
        System.out.println("Number of duplicates removed: " + removedCount);
    }
}
