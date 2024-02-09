package com.example.first.demo.Entity;

import jakarta.persistence.*;
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
public class Reading {

//    @GeneratedValue
//    private Long id;
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long readingId;
//    @ManyToOne
//    @JoinColumn(name="customerId")
    private Long customerId;

    private double currentReading;
    private double previousReading;
    private LocalDate readingDate;

}
