package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Eclipse_Lab3_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a line of integers separated by spaces:");

		String input = scanner.nextLine();

		StringTokenizer token = new StringTokenizer(input);

		int sum = 0;

		System.out.println("The integers are:");
		while (token.hasMoreTokens()) {

			int number = Integer.parseInt(token.nextToken());

			System.out.println(number);

			sum += number;
		}

		System.out.println("The sum of all integers is: " + sum);

		scanner.close();
	}
}