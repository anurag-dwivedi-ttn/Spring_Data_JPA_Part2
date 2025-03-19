package com.example.spring_data_jpa2.demo.controller;
import com.example.spring_data_jpa2.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/highSalary")
    public List<Object[]> getHighSalaryEmployees() {
        return employeeService.getEmployeesWithHighSalary();
    }

    @PutMapping("/updateSalary/{newSalary}")
    public void updateLowSalaryEmployees(@PathVariable Double newSalary) {
        employeeService.updateLowSalaryEmployees(newSalary);
    }

    @DeleteMapping("/deleteMinSalary")
    public void deleteMinSalaryEmployees() {
        employeeService.deleteEmployeesWithMinimumSalary();
    }

    @GetMapping("/lastNameSingh")
    public List<Object[]> getEmployeesWithLastNameSingh() {
        return employeeService.findEmployeesWithLastNameSingh();
    }

    @DeleteMapping("/deleteOlderThan/{age}")
    public void deleteEmployeesOlderThan(@PathVariable int age) {
        employeeService.deleteEmployeesOlderThan(age);
    }
}
