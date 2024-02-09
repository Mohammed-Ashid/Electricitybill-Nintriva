package com.example.first.demo.mappers;

import com.example.first.demo.Entity.Customer;
import com.example.first.demo.Vo.CustomerVo;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class CustomerMapper {
    public static Customer tocustomer(CustomerVo customer){
        return Customer.builder()
                .customerId(customer.getCustomerId())
                .name(customer.getName())
                .email(customer.getEmail())
                .build();
    }
}
