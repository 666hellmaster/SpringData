package com.example.springdatajpa;

import org.springframework.data.repository.CrudRepository;

/**
 * @author ruzicka
 * @since 2024-03-01
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}
