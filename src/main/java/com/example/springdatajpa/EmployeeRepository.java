package com.example.springdatajpa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
/**
 * @author ruzicka
 * @since 2024-03-01
 */


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByAgeGreaterThan(int age);
}
