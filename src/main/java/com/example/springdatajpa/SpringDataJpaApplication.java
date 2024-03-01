package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args) -> {
            // save a few employees
            repository.save(new Employee(1,"John", "Doe"));
            repository.save(new Employee(2,"Jane", "Doe"));
            repository.save(new Employee(3,"Jim", "Doe"));
        };
    }
}