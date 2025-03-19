package com.example.spring_data_jpa2.demo.entity.joined;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
public class Car extends Vehicle {
    private int numDoors;
}
