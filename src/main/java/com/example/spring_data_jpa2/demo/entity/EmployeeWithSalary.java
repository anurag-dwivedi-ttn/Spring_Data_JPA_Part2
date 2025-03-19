package com.example.spring_data_jpa2.demo.entity;

import com.example.spring_data_jpa2.demo.embedded.Salary;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class EmployeeWithSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;

    //Q4)
    @Embedded
    private Salary salaryDetails;
}