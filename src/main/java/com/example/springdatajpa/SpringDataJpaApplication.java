package com.example.springdatajpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpringDataJpaApplication {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:32768/employee";
        String user = "postgres";
        String password = "pass123";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");

                // Create table
                String createTableSQL = "CREATE TABLE IF NOT EXISTS employee (id SERIAL PRIMARY KEY, name VARCHAR(255), age INT)";
                connection.createStatement().executeUpdate(createTableSQL);

                // Insert sample data
                String insertSQL = "INSERT INTO employee (name, age) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
                preparedStatement.setString(1, "John Doe");
                preparedStatement.setInt(2, 30);
                preparedStatement.executeUpdate();

                preparedStatement.setString(1, "Jane Smith");
                preparedStatement.setInt(2, 25);
                preparedStatement.executeUpdate();

                preparedStatement.setString(1, "Alice Johnson");
                preparedStatement.setInt(2, 35);
                preparedStatement.executeUpdate();

                System.out.println("Sample data inserted into the database.");

                connection.close();
            } else {
                System.out.println("Failed to connect to the PostgreSQL server.");
            }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

}
