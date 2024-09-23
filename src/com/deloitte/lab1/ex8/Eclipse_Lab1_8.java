package com.deloitte.lab1.ex8;

public class Eclipse_Lab1_8 {

	
	static int checkNumber(int n) {
		
//		binary trick (only for 2 power)
//		4 & 3 becomes 0100 & 0011 = 0000 (the result is 0).
		
		if (n > 0 && (n & (n - 1)) == 0) {
            return 1;
        }
		return 0; 
	}
	
	public static void main(String[] args) {
		int result = checkNumber(8);
		System.out.print("This Number is " + (result == 1 ? "a power of 2" : "not a power of 2"));
	}

}
