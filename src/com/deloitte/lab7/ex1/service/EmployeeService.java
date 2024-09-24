package com.deloitte.lab7.ex1.service;


import com.deloitte.lab7.ex1.bean.Employee;
import java.util.Map;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
    Employee findEmployeeByScheme(String insuranceScheme);
    Map<Integer, Employee> getAllEmployees();
}
