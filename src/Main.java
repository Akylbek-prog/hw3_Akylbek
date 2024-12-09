public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.2, 3.4, -2.5, 4.5, -1.1, 5.0, 6.7, -3.3, 2.1, -4.0, 3.8, -5.2, 7.5, 8.3, -6.6};

        boolean firstNegativeFound = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (!firstNegativeFound && num < 0) {
                firstNegativeFound = true;
            } else if (firstNegativeFound && num > 0) {
                sum += num;
                count++;
            }
        }


        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        }
    }
}