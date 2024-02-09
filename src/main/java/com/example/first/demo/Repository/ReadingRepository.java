package com.example.first.demo.Repository;

import com.example.first.demo.Entity.Customer;
import com.example.first.demo.Entity.Reading;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingRepository extends JpaRepository <Reading,Long>{

}
