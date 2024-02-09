package com.example.first.demo.Service;

import com.example.first.demo.Vo.PriceSlabVo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
@Repository
public interface PriceSlabService {
    public String newSlab( PriceSlabVo priceSlab);
}
