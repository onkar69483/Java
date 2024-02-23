public class StatisticsCalculator {
    public static double findMinimum(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double findMaximum(double[] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double calculateStandardDeviation(double[] numbers) {
        double mean = calculateAverage(numbers);
        double sumSquaredDiff = 0;
        for (double num : numbers) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        double variance = sumSquaredDiff / numbers.length;
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        double[] numbers = {45, 98, 32, 50, 63};
        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
    }
}
