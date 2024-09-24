package com.deloitte.lab5.ex1;

public class AgeValidation {

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 15) {
			throw new InvalidAgeException("Age must be greater than 15.");
		} else {
			System.out.println("Age is valid.");
		}
	}

	public static void main(String[] args) {
		try {
			int age = 12;
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
		super(message);
	}
}