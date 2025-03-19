package com.example.spring_data_jpa2.demo.service;

import com.example.spring_data_jpa2.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Q1.1 - Display first name, last name of employees having salary greater than average salary.
     */
    public List<Object[]> getEmployeesWithHighSalary() {
        return employeeRepository.findEmployeesWithHighSalary();
    }

    /**
     * Q1.2 - Update salary of employees below average salary.
     */
    @Transactional
    public void updateLowSalaryEmployees(Double newSalary) {
        employeeRepository.updateLowSalaryEmployees(newSalary);
    }

    /**
     * Q1.3 - Delete employees with minimum salary.
     */
    @Transactional
    public void deleteEmployeesWithMinimumSalary() {
        employeeRepository.deleteEmployeesWithMinimumSalary();
    }

    /**
     * Q2.1 - Display id, first name, age of employees where last name ends with "Singh".
     */
    public List<Object[]> findEmployeesWithLastNameSingh() {
        return employeeRepository.findEmployeesWithLastNameSingh();
    }

    /**
     * Q2.2 - Delete employees older than a given age.
     */
    @Transactional
    public void deleteEmployeesOlderThan(int age) {
        employeeRepository.deleteEmployeesOlderThan(age);
    }
}
