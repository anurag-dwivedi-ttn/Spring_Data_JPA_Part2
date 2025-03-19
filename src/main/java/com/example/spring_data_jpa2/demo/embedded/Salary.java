package com.example.spring_data_jpa2.demo.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
/*
Q4)Component Mapping: 1) Implement and demonstrate Embedded mapping
using employee table having following fields: id, firstName, lastName, age, basicSalary,
 bonusSalary, taxAmount, specialAllowanceSalary.
Note- here make the Salary entity it will be embedded in EmployeeWithSalary table*/
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
    private double basicSalary;
    private double bonusSalary;
    private double taxAmount;
    private double specialAllowanceSalary;
}
