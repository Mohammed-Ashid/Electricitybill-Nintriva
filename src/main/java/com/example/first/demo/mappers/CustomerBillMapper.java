package com.example.first.demo.mappers;

import com.example.first.demo.Vo.ReadingVo;
import com.example.first.demo.view.CustomerBill;

public class CustomerBillMapper {
    public static CustomerBill tocustomerBill(ReadingVo reading){
        return CustomerBill.builder()
                .unit((reading.getCurrentReading()- reading.getPreviousReading()))
                .build();
    }
}
