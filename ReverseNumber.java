4import java.io.*;
import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
         int number,reverse;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        reverse = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            reverse = reverse * 10 + digit; // Append the digit to the reverse number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reverse);

        
    }
}
