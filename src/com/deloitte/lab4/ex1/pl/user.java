package com.deloitte.lab4.ex1.pl;

import com.deloitte.lab4.ex1.bean.Employee;
import com.deloitte.lab4.ex1.service.Services;

public class user {

    public static void main(String[] args) {
        Services services = new Services();
        
        Employee employee = services.getEmployeeDetails();
        
        String insuranceScheme = services.findInsuranceScheme(employee.getSalary(), employee.getDesignation());
        employee.setInsuranceScheme(insuranceScheme);
  
        services.displayEmployeeDetails(employee);
    }
}
