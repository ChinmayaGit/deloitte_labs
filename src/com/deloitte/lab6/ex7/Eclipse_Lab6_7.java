package com.deloitte.lab6.ex7;

import java.util.Arrays;

public class Eclipse_Lab6_7 {

	public static int[] getSorted(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = reverseNumber(arr[i]);
		}

		Arrays.sort(arr);

		return arr;
	}

	private static int reverseNumber(int num) {
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		return Integer.parseInt(sb.reverse().toString());
	}

	public static void main(String[] args) {

		int[] numbers = { 123, 456, 789, 12, 9 };

		int[] sortedArray = getSorted(numbers);

		System.out.println("Sorted array after reversing: " + Arrays.toString(sortedArray));
	}
}
