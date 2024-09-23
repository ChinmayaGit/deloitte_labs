package com.deloitte.lab1.ex6;

public class Eclipse_Lab1_6 {

	    public int calculateDifference(int n) {
	        int Squares = 0;
	        int sum = 0;
	        
	        for (int i = 1; i <= n; i++) {
	            Squares += i * i;
	            sum += i;
	        }
	        int temp = sum * sum;
	        return Squares - temp;
	    }

	    public static void main(String[] args) {
	    	Eclipse_Lab1_6 obj = new Eclipse_Lab1_6();
	        int n = 4; 
	        int result = obj.calculateDifference(n);
	        System.out.println("Difference: " + result);
	    }
	}
