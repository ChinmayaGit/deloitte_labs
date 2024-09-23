package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Eclipse_Lab2_2 {


	    public static void main(String[] args) {
	        String[] arr = {"banana", "Apple", "orange", "kiwi", "grape", "mango"};
	        String[] sortedArr = sortStrings(arr);
	        System.out.println(Arrays.toString(sortedArr));
	    }

	    public static String[] sortStrings(String[] arr) {
	       
	        Arrays.sort(arr);

	        int middleIndex = (arr.length + 1) / 2;

	        String[] result = new String[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            if (i < middleIndex) {
	                result[i] = arr[i].toUpperCase();
	            } else {
	                result[i] = arr[i].toLowerCase();
	            }
	        }

	        return result;
	    }
	}
