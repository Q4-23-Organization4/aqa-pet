package dev.aleksandrtesliuk.FirstTask;

import java.util.*;

public class DuplicateRemover {
    private final List<Integer> numbers;

    public DuplicateRemover(int size, int min, int max) {
        numbers = new ArrayList<>();
        fillWithRandomNumbers(size, min, max);
    }

    private void fillWithRandomNumbers(int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(max - min + 1) + min);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> removeDuplicates() {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbers);
    }

    public int countRemovedDuplicates(List<Integer> uniqueNumbers) {
        return numbers.size() - uniqueNumbers.size();
    }
}
