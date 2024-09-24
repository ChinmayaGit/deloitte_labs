package com.deloitte.lab4.ex2.pl;

import com.deloitte.lab4.ex2.bean.Employee;
import com.deloitte.lab4.ex2.service.Services;

public class user {

    public static void main(String[] args) {
        Services services = new Services();
        
        Employee employee = services.getEmployeeDetails();
        
        String insuranceScheme = services.findInsuranceScheme(employee.getSalary(), employee.getDesignation());
        employee.setInsuranceScheme(insuranceScheme);
  
        services.displayEmployeeDetails(employee);
    }
}
