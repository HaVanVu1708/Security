package com.example.security.service;

import com.example.security.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findbyId(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

    public List<Employee> searchBy(String theName);
}
