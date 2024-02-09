package com.example.first.demo.mappers;

import com.example.first.demo.Entity.PriceSlab;
import com.example.first.demo.Vo.PriceSlabVo;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PriceSlabMapper {
    public static PriceSlab topriceslab(PriceSlabVo priceSlab){
        return PriceSlab.builder()
                .slabRate(priceSlab.getSlabRate())
                .startUnit(priceSlab.getStartUnit())
                .endUnit(priceSlab.getEndUnit())
                .build();
    }

}
