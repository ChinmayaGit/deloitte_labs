package com.deloitte.lab4.ex1.service;

import com.deloitte.lab4.ex1.bean.Employee;
import java.util.Scanner;

public class Services {
    
    public Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();
        
        return new Employee(id, name, salary, designation);
    }

    public String findInsuranceScheme(double salary, String designation) {
        if (salary < 5000) {
            return "No Scheme";
        } else if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("Clerk")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Director")) {
            return "Scheme A";
        } else {
            return "No Scheme";
        }
    }

    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }
}
