package com.example.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ruzicka
 * @since 2024-03-04
 */

@SpringBootApplication
public class SpringDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
        DataLoader dataLoader = new DataLoader();
        dataLoader.insertData();
    }

}