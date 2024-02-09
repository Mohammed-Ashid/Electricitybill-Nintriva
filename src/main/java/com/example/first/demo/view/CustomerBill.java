package com.example.first.demo.view;

import com.example.first.demo.Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor


@SuperBuilder
public class CustomerBill  {
   public Double unit;
   public Double  bill;



}
