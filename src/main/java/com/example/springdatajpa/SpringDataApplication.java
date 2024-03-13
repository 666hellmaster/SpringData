package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ruzicka
 * @since 2024-03-04
 */

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
        // todo ruzicka(hejny) proc tvoris instanci - tu vytvari spring
       // DataLoader dataLoader = new DataLoader();
       // dataLoader.insertData();
    }

    @Autowired
    DataLoader dataLoader;

    @Override
    public void run(String... args) throws Exception {
        dataLoader.insertData();
    }
}
