package com.deloitte.lab3.ex8;

public class Eclipse_Lab3_6 {

	public static void main(String[] args) {
		String testString = "ANT";
		boolean isPositive = isPositiveString(testString);

		System.out.println("Is the string \"" + testString + "\" a positive string? " + isPositive);
	}

	public static boolean isPositiveString(String str) {
		for (int i = 1; i < str.length(); i++) {
			// Compare ASCII values
			if (str.charAt(i) <= str.charAt(i - 1)) {

				return false;
			}
			System.out.println("chinu" + str.charAt(i));
		}
		return true;
	}
}
