package com.deloitte.lab5.ex3;

import com.deloitte.lab5.ex3.exception.EmployeeException;

public class Eclipse_Lab5_3 {
	public static void validateSalary(double salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary is below 3000. Employee salary must be at least 3000.");
		}
		System.out.println("Salary is valid: " + salary);
	}

	public static void main(String[] args) {
		try {

			double salary = 3500;
			validateSalary(salary);

		} catch (EmployeeException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
