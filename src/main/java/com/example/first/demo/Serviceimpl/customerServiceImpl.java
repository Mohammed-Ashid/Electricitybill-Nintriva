package com.example.first.demo.Serviceimpl;
import com.example.first.demo.Entity.Customer;


import com.example.first.demo.Entity.Reading;
import com.example.first.demo.Repository.PriceSlabRepository;
import com.example.first.demo.Repository.ReadingRepository;
import com.example.first.demo.Repository.customerRepository;
import com.example.first.demo.Service.CustomerService;
import com.example.first.demo.Vo.CustomerVo;

import com.example.first.demo.Vo.ReadingVo;

import com.example.first.demo.mappers.CustomerMapper;
import com.example.first.demo.view.CustomerBill;
import com.example.first.demo.mappers.ReadingMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


import java.util.Optional;


import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class customerServiceImpl implements CustomerService {

    private final customerRepository CustomerRepository;

    private final ReadingRepository readingRepository;

    private final PriceSlabRepository priceSlabRepository;


    @Override
    public String createCustomer(CustomerVo customer) {
        Customer customers = CustomerMapper.tocustomer(customer);
        CustomerRepository.save(customers);
        return "Customer Registered Successfully";

    }

    @Override
    @Transactional
    public Double CustomerBill(Long customerId,Long readingId) {
        CustomerBill customerBill = new CustomerBill();


        Optional<Reading> res =readingRepository.findById(readingId);
        ReadingVo Res=ReadingMapper.toReadingVoList(res);
        Double current= Res.getCurrentReading();
        Double previous= Res.getPreviousReading();
        Double unit= current-previous;
        customerBill.unit=unit;

Double slabrate=getSlabRateByUnit(unit);
         customerBill.bill = unit * slabrate;
return customerBill.bill;

    }

    public Double getSlabRateByUnit(double unit) {
        return priceSlabRepository.findSlabRateByUnit(unit);


    }
}
