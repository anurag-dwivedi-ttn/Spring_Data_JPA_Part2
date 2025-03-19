package com.example.spring_data_jpa2.demo.entity.singletable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Manager")
@Data
@NoArgsConstructor
public class Manager extends EmployeeType {
    private int teamSize;
}
