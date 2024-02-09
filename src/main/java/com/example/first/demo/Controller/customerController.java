package com.example.first.demo.Controller;

import com.example.first.demo.Service.CustomerService;
import com.example.first.demo.Vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class customerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/createcustomer")
    public String createCustomer(@RequestBody CustomerVo customer){

        return customerService.createCustomer(customer);

    }
    @PostMapping("/customerbill")
    public Double CustomerBill(@RequestParam Long customerId,@RequestParam Long readingId){

        return customerService.CustomerBill(customerId,readingId);
    }
}
