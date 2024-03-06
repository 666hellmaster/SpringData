package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Bean
    @Override
    public void run(String... args) throws Exception {
        insertData();
    }

    public void insertData() {
        // Populate sample data
        jdbcTemplate.execute("INSERT INTO employee (id, first_name, last_name) VALUES (1, 'John', 'Doe')");
        jdbcTemplate.execute("INSERT INTO employee (id, first_name, last_name) VALUES (2, 'Jane', 'Doe')");
        jdbcTemplate.execute("INSERT INTO employee (id, first_name, last_name) VALUES (3, 'Emily', 'Doe')");
        System.out.println("Sample data inserted into the database.");
    }
}
