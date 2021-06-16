package com.example.security.dao;

import com.example.security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //add a method to sort by last name
    public List<Employee> findAllByOrderbyLastNameAsc();

    //search by name
    public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
