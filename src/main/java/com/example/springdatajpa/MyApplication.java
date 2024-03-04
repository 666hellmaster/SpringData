package com.example.springdatajpa;

/**
 * @author ruzicka
 * @since 2024-03-04
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class MyApplication {

    private final EmployeeService employeeService;

    @Autowired
    public MyApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostConstruct
    public void run() {
        // Specify the age threshold
        int ageThreshold = 20;

        // Retrieve employees whose age is greater than the specified value
        List<Employee> employees = employeeService.getEmployeesByAgeGreaterThan(ageThreshold);

        // Print the retrieved employees
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }
}
