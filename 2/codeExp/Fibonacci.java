

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int prev1 = 1;
        int prev2 = 1;
        int fibbonaci = 0;

        for (int i = 0; i < n; i++) {
        	
            fibbonaci = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibbonaci;
        }

    	System.out.println("Fibbonaci of " + n + " is: " + fibbonaci);
    }
}

