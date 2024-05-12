package dev.aleksandrtesliuk.SecondTask;

import java.util.*;

class Partitioner {
    private List<Integer> numbers;
    private final int X;

    public Partitioner(int X) {
        this.numbers = new ArrayList<>(20);
        this.X = X;
    }

    public void fillList() {
        Random random = new Random();
        for (int i = 0; i < 19; i++) {
            numbers.add(random.nextInt(100));
        }
        numbers.add(X);
    }

    public void rearrangeList() {
        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            while (left < numbers.size() && numbers.get(left) < X) {
                left++;
            }
            while (right >= 0 && numbers.get(right) > X) {
                right--;
            }
            if (left < right) {
                int temp = numbers.get(left);
                numbers.set(left, numbers.get(right));
                numbers.set(right, temp);
            }
        }
    }

    public void printList() {
        System.out.println(numbers);
    }
}
