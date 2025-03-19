package com.example.spring_data_jpa2.demo.entity.joined;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

//Q3)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
}
