package com.example.spring_data_jpa2.demo.entity.tableperclass;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
public abstract class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private double amount;
}
