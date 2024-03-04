package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public DataLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Populate sample data
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setAge(31);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Jane Smith");
        employee2.setAge(25);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setName("Alice Johnson");
        employee3.setAge(35);
        employeeRepository.save(employee3);

        System.out.println("Sample data inserted into the database.");
    }
}
