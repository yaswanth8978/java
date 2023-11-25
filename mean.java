import java.util.Arrays;
import java.util.Scanner;

public class mean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

                                                
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double mean = (double) sum / n;

                                                 
        double median;
        if (n % 2 == 0) {
            median = (double) (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            median = numbers[n / 2];
        }

                                                    
        int[] frequencies = new int[101];         
        int maxFrequency = 0;
        int mode = 0;

        for (int num : numbers) {
            frequencies[num]++;
            if (frequencies[num] > maxFrequency) {
                maxFrequency = frequencies[num];
                mode = num;
            }
        }

                                                 
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);

    }
}

