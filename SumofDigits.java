import java.util.Scanner;
import java.io.*;
import java.util.*;
class SumOfDigits {
    public static void main(String[] args) {
        int n,number;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        int sum = 0;
  

        while (n!= 0) {
            int digit = n% 10;
            sum += digit;
            n/= 10;
        }

        System.out.println("The sum of digits of " + " is: " + sum);

       
    }
}
