package com.example.spring_data_jpa2.demo.entity.joined;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bike")
@Data
@NoArgsConstructor
public class Bike extends Vehicle {
    private boolean hasCarrier;
}
