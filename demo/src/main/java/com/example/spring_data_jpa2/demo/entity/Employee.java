package com.example.spring_data_jpa2.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "employeeTable")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private Long id;

    @Column(name = "empFirstName")
    private String firstName;

    @Column(name = "empLastName")
    private String lastName;

    @Column(name = "empSalary")
    private Double salary;

    @Column(name = "empAge")
    private int age;
}
