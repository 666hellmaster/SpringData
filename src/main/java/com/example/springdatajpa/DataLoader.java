package com.example.springdatajpa;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
//todo: upravit propojeni s db
@Component
public class DataLoader {

    private final JdbcTemplate jdbcTemplate;


    public DataLoader(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void insertData() {
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(1,'Victor', 'Hugo')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(2,'Dante', 'Alighieri')");
        jdbcTemplate.execute("INSERT INTO employee(id,firstname,lastname) VALUES(3,'Stefan', 'Zweig')");
    }
}