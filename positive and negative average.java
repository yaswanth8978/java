import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0;
        int positiveCount = 0;
        int negativeSum = 0;
        int negativeCount = 0;

        System.out.println("Enter numbers (enter -1 to stop):");

        int num = scanner.nextInt();

        while (num != -1) {
            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }

            num = scanner.nextInt();
        }

        // Calculate averages
        double positiveAverage = (positiveCount == 0) ? 0 : (double) positiveSum / positiveCount;
        double negativeAverage = (negativeCount == 0) ? 0 : (double) negativeSum / negativeCount;

        // Display results
        System.out.println("Average of positive numbers: " + positiveAverage);
        System.out.println("Average of negative numbers: " + negativeAverage);
    }
}
