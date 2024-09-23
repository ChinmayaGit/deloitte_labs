package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {
	    
	    
	    public static int fibonacciRecursive(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }

	    
	    public static int fibonacciNonRecursive(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        int fib1 = 0, fib2 = 1, fibN = 1;
	        for (int i = 2; i <= n; i++) {
	            fibN = fib1 + fib2;
	            fib1 = fib2;
	            fib2 = fibN;
	        }
	        return fibN;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();
	        
	    
	        System.out.println("Fibonacci (Recursive) value at position " + n + " is: " + fibonacciRecursive(n));
	        
	      
	        System.out.println("Fibonacci (Non-Recursive) value at position " + n + " is: " + fibonacciNonRecursive(n));
	        
	        sc.close();
	    }
	}
