package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("101", "Sulejman", "Akar", "sulejman@example.com", "Software Engineering Student"));
        list.add(new Employee("102", "Jane", "Doe", "jane@hpe.com", "Backend Developer"));
        list.add(new Employee("103", "John", "Smith", "john@hpe.com", "System Architect"));

        employees.setEmployeeList(list);
    }

    public Employees getEmployees() {
        return employees;
    }
}