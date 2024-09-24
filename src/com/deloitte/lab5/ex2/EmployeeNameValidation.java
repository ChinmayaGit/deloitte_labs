package com.deloitte.lab5.ex2;


public class EmployeeNameValidation {

 public static void validateFullName(String firstName, String lastName) throws InvalidNameException {
     if (firstName == null || firstName.trim().isEmpty()) {
         throw new InvalidNameException("First name cannot be blank.");
     }
     if (lastName == null || lastName.trim().isEmpty()) {
         throw new InvalidNameException("Last name cannot be blank.");
     }
     
     System.out.println("Full name is valid: " + firstName + " " + lastName);
 }

 public static void main(String[] args) {
     try {
         String firstName = "John";
         String lastName = "Doe";

         validateFullName(firstName, lastName);
         
     } catch (InvalidNameException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}

class InvalidNameException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidNameException(String message) {
     super(message);
 }
}
