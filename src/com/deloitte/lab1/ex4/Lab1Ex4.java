package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {

    public static void main(String[] args) {
        boolean is_prime = true; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            is_prime = false;
        } else {
        
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    is_prime = false;
                    break;
                }
            }
        }

        // Output corrected with proper space and logic
        System.out.print(n + " is " + (is_prime ? "a prime number." : "not a prime number."));
        
        sc.close();
    }
}
