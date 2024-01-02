import java.util.Random;

public class ReplaceEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        System.out.println("Source array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n\nArray after replacing even numbers with zero:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
            System.out.print(numbers[i] + " ");
        }
    }
}

