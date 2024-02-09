package com.example.first.demo.Vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PriceSlabVo {

    private double slabRate;
    private double startUnit;
    private double endUnit;
}
