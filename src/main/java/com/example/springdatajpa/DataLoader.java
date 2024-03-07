package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataLoader(EmployeeRepository employeeRepository, JdbcTemplate jdbcTemplate) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        insertData();
    }

    public void insertData() {
        // Populate sample data
        employeeRepository.save(new Employee(1L, "John", "Doe"));
        employeeRepository.save(new Employee(2L, "Jane", "Doe"));
        employeeRepository.save(new Employee(3L, "Emily", "Doe"));
        
        

        System.out.println("Sample data inserted into the database.");
    }
}
