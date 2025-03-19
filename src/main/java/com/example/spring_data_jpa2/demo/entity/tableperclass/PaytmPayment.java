package com.example.spring_data_jpa2.demo.entity.tableperclass;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PaytmPayment extends Payment {
    private String phoneNumber;
}
