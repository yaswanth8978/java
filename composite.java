import java.io.*;
import java.util.*;
class composite {
    public static void main(String[] args) {
        int A = 10;                                 
        int B = 50;                                
        System.out.println("Composite numbers between " + A + " and " + B + ":");
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isComposite(int num) {
        if (num < 2) {
            return false;                         
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;                     
            } 
        }
        return false;                          
    }
}
