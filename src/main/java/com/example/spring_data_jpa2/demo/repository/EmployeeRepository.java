package com.example.spring_data_jpa2.demo.repository;

import com.example.spring_data_jpa2.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Q1.1 - Display first name, last name of employees having salary greater than average salary.
    @Query(value = "SELECT emp_first_name, emp_last_name FROM employee_table " +
            "WHERE emp_salary > (SELECT AVG(emp_salary) FROM employee_table) " +
            "ORDER BY emp_age ASC, emp_salary DESC", nativeQuery = true)
    List<Object[]> findEmployeesWithHighSalary();

    // Q1.2 - Update salary of employees below average salary.
    @Modifying
    @Transactional
    @Query(value = "UPDATE employee_table " +
            "SET emp_salary = :newSalary " +
            "WHERE emp_salary < (SELECT AVG(emp_salary) FROM employee_table)", nativeQuery = true)
    void updateLowSalaryEmployees(Double newSalary);

    // Q1.3 - Delete employees with minimum salary.
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employee_table " +
            "WHERE emp_salary = (SELECT MIN(emp_salary) FROM employee_table)", nativeQuery = true)
    void deleteEmployeesWithMinimumSalary();

    // Q2.1 - Display id, first name, age of employees where last name ends with "Singh".
    @Query(value = "SELECT emp_id, emp_first_name, emp_age FROM employee_table " +
            "WHERE emp_last_name LIKE '%Singh'", nativeQuery = true)
    List<Object[]> findEmployeesWithLastNameSingh();

    // Q2.2 - Delete employees older than a given age.
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employee_table WHERE emp_age > :age", nativeQuery = true)
    void deleteEmployeesOlderThan(int age);
}
