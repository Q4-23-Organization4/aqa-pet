public class SinTable {
    public static void main(String[] args) {
        double[] sinValues = new double[37];

        for (int i = 0; i <= 360; i += 10) {
            double radians = Math.toRadians(i);
            sinValues[i / 10] = Math.sin(radians);
        }

        System.out.println("x\t\t\t\t\t\t\t\tsin(x)");
        for (int i = 0; i <= 360; i += 10) {
            System.out.printf("%d\t\t\t\t\t\t\t\t%.4f\n", i, sinValues[i / 10]);
        }
    }
}

