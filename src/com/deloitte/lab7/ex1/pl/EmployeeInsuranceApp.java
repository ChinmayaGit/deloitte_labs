package com.deloitte.lab7.ex1.pl;

import com.deloitte.lab7.ex1.bean.Employee;
import com.deloitte.lab7.ex1.service.EmployeeService;
import com.deloitte.lab7.ex1.service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeInsuranceApp {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Find Employee by Insurance Scheme");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add employee details
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();

                    // Determine insurance scheme
                    String insuranceScheme = getInsuranceScheme(salary, designation);

                    Employee employee = new Employee(id, name, salary, designation, insuranceScheme);
                    service.addEmployee(employee);
                    System.out.println("Employee added: " + employee);
                    break;

                case 2:
                    // Delete employee
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteEmployee(deleteId);
                    System.out.println("Employee deleted.");
                    break;

                case 3:
                    // Find employee by insurance scheme
                    System.out.print("Enter Insurance Scheme: ");
                    sc.nextLine();  // consume newline
                    String scheme = sc.nextLine();
                    Employee emp = service.findEmployeeByScheme(scheme);
                    if (emp != null) {
                        System.out.println("Employee found: " + emp);
                    } else {
                        System.out.println("No employee found with the given scheme.");
                    }
                    break;

                case 4:
                    // Display all employees
                    System.out.println("All Employees: " + service.getAllEmployees());
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting application...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    // Method to determine insurance scheme based on salary and designation
    public static String getInsuranceScheme(double salary, String designation) {
        if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        } else {
            return "No Scheme";
        }
    }
}
