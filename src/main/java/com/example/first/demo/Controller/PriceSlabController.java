package com.example.first.demo.Controller;

import com.example.first.demo.Service.PriceSlabService;
import com.example.first.demo.Vo.PriceSlabVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/priceslab")
public class PriceSlabController {
    @Autowired
    private PriceSlabService priceSlabService;
    @PostMapping("/newslab")
    public String newSlab(@RequestBody PriceSlabVo priceSlab){
        return priceSlabService.newSlab(priceSlab);
    }
}
