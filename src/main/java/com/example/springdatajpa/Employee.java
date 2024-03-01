package com.example.springdatajpa;

/**
 * @author ruzicka
 * @since 2024-03-01
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String Firstname;
    private String LastName;

    public Employee() {
        
    }

    public Employee(int number, String john, String doe) {
    }
}
