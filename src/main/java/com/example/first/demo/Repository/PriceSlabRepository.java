package com.example.first.demo.Repository;

import com.example.first.demo.Entity.PriceSlab;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceSlabRepository extends JpaRepository<PriceSlab,Long> {
    @Query("SELECT sp.slabRate FROM PriceSlab sp WHERE :unit > sp.startUnit AND :unit < sp.endUnit")
    Double findSlabRateByUnit(@Param("unit") double unit);
}
