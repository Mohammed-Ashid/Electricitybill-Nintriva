package com.example.first.demo.Serviceimpl;

import com.example.first.demo.Entity.PriceSlab;
import com.example.first.demo.Repository.PriceSlabRepository;
import com.example.first.demo.Service.PriceSlabService;
import com.example.first.demo.Vo.PriceSlabVo;
import com.example.first.demo.mappers.PriceSlabMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PriceSlabServiceImpl implements PriceSlabService {
//    @Autowired
    private final PriceSlabRepository priceSlabRepository;
    @Override
    public String newSlab(PriceSlabVo priceSlab) {
    PriceSlab priceslab= PriceSlabMapper.topriceslab(priceSlab);
    priceSlabRepository.save(priceslab);
    return "Slab Added";
    }
}
