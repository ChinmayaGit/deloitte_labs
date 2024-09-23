package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Eclipse_Lab3_4 {

	public static int modifyNumber(int number) {

		String numberStr = Integer.toString(number);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < numberStr.length() - 1; i++) {

			int currentDigit = numberStr.charAt(i) - '0'; // char to int conversion
			int nextDigit = numberStr.charAt(i + 1) - '0';

			int difference = Math.abs(currentDigit - nextDigit);

			result.append(difference);
		}

		return Integer.parseInt(result.toString());
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = scanner.nextInt();

		int modifiedNumber = modifyNumber(number);
		System.out.println("Modified Number: " + modifiedNumber);

		scanner.close();
	}
}
