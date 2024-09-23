package com.deloitte.lab1.ex5;

import java.util.Scanner;

public class Eclipse_Lab1_5 {

    static double calculateSum(int n) {
        double sum = 0;
   
        for (int i = 1; i <= n; i++) {
           
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i; 
            }
        }
        
        return sum;  
    }

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Enter a natural number to calculate the sum of numbers divisible by 3 or 5: ");
        int n = sc.nextInt();
        
     
        double result = calculateSum(n);
        System.out.println("The sum of numbers divisible by 3 or 5 up to " + n + " is: " + result);
        
        sc.close();  
    }
}
