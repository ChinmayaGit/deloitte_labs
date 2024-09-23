package com.deloitte.lab1.ex1;

import java.util.Scanner;

public class Lab1Ex1 {
   
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in); 
       System.out.print("Enter a number: ");
       int n = sc.nextInt(); 

       int sum = (n * (n + 1)) / 2; 
       int result = sum * sum;  
       System.out.println("The square of the sum is: " + result);
       sc.close();
   }
}
