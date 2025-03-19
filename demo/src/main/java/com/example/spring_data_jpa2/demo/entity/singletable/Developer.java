package com.example.spring_data_jpa2.demo.entity.singletable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Developer")
@Data
@NoArgsConstructor
public class Developer extends EmployeeType {
    private String programmingLanguage;
}
