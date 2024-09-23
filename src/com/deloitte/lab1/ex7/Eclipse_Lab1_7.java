package com.deloitte.lab1.ex7;

public class Eclipse_Lab1_7 {
	    public boolean checkNumber(int number) {
	    	
	        String numStr = Integer.toString(number);
	        
	        for (int i = 0; i < numStr.length() - 1; i++) {
	            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	    	Eclipse_Lab1_7 obj = new Eclipse_Lab1_7();
	        int number = 124468;
	        boolean result = obj.checkNumber(number);
	        System.out.println("Is the number " + number + " increasing? " + result);
	    }
	}
