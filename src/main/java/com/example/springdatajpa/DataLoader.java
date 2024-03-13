package com.example.springdatajpa;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public DataLoader() {
    }

    public void insertData() {
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(1,'Victor', 'Hugo')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(2,'Dante', 'Alighieri')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(3,'Stefan', 'Zweig')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(4,'Oscar', 'Wilde')");
    }
}