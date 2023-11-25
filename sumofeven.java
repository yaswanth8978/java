import java.io.*;
import java.util.*;
class sumofeven
{
    public static void main(String[] args) { 
        int n; 
        int sum = 0;
  Scanner s= new Scanner(System.in);
  System.out.println("enter the n value ");
  n = s.nextInt();

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("The sum of even numbers from 2 to " + n + " is: " + sum);
    }
}
