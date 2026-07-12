package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    // Manager objesi yalnızca bir kez oluşturulur, böylece liste durumu korunur.
    private EmployeeManager manager = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return manager.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        manager.addEmployee(employee);
        return employee;
    }
}