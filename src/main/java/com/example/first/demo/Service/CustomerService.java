package com.example.first.demo.Service;

import com.example.first.demo.Vo.CustomerVo;

public interface CustomerService {
    public Double CustomerBill(Long customerId,Long readingId);

    public String createCustomer(CustomerVo customer);
}
