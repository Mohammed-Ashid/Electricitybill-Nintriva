package com.example.first.demo.Vo;

import com.example.first.demo.Entity.Customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadingVo {
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
