package com.example.spring_data_jpa2.demo.entity.singletable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//Q3)-
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type")
@Table(name = "employee")
@Data
@NoArgsConstructor
public abstract class EmployeeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
