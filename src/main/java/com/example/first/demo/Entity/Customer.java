package com.example.first.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor


@Builder

public class Customer {

    @GeneratedValue
    private Long id;
    @Id
    private Long customerId;
    private String name;
    private String email;


}
