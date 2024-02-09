package com.example.first.demo.Vo;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data@NoArgsConstructor
@AllArgsConstructor
@Builder



public class CustomerVo {
    @Id
    private Long customerId;
    private String name;
    private String email;

}
