public class MatrixAnalysis {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -3, 5, 2},
                {-2, 4, -6, -1},
                {-7, -8, 9, -5},
                {-9, 3, -4, 8}
        };

        int negativeCount = 0;
        int oddSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j && matrix[i][j] < 0) {
                    negativeCount++;
                }

                if (i < j && matrix[i][j] % 2 != 0) {
                    oddSum += matrix[i][j];
                }
            }
        }

        System.out.println("Number of negative elements below the main diagonal: " + negativeCount);
        System.out.println("Sum of odd elements above the main diagonal: " + oddSum);
    }
}

