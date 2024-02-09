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

import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

@SuperBuilder
@Builder
public class PriceSlab {
    @Id
    @GeneratedValue
    private Long id;
    private double slabRate;
    private double startUnit;
    private double endUnit;


}

