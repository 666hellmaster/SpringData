package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insertData() {
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(1,'Victor', 'Hugo')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(2,'Dante', 'Alighieri')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(3,'Stefan', 'Zweig')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(4,'Oscar', 'Wilde')");
    }
}