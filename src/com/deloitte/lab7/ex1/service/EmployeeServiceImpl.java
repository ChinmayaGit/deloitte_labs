package com.deloitte.lab7.ex1.service;


import com.deloitte.lab7.ex1.bean.Employee;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeMap.remove(id);
    }

    @Override
    public Employee findEmployeeByScheme(String insuranceScheme) {
        for (Employee employee : employeeMap.values()) {
            if (employee.getInsuranceScheme().equalsIgnoreCase(insuranceScheme)) {
                return employee;
            }
        }
        return null; // return null if no employee found
    }

    @Override
    public Map<Integer, Employee> getAllEmployees() {
        return employeeMap;
    }
}
