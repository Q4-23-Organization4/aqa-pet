public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {3, 14, 2, 7, 12, 6, 231};

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

