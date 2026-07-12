package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp() {
        // Her test metodundan önce yönetici sınıfını sıfırdan başlatır (3 sabit veri ile)
        employeeManager = new EmployeeManager(); 
    }

    @Test
    public void testGetEmployees() {
        // Sistemin başlangıçta tam olarak 3 kayıt listelediğini doğrular (Assert)
        int currentSize = employeeManager.getEmployees().getEmployeeList().size();
        assertEquals(3, currentSize);
    }

    @Test
    public void testAddEmployee() {
        // Sisteme test amaçlı yeni bir çalışan objesi enjekte eder
        Employee newEmployee = new Employee("999", "Test", "User", "test@hpe.com", "QA Engineer");
        employeeManager.addEmployee(newEmployee);
        
        // Listenin 4 elemana çıktığını ve son elemanın adının "Test" olduğunu teyit eder
        int newSize = employeeManager.getEmployees().getEmployeeList().size();
        assertEquals(4, newSize);
        assertEquals("Test", employeeManager.getEmployees().getEmployeeList().get(3).getFirst_name());
    }
}