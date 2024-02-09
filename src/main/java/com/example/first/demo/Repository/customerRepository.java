package com.example.first.demo.Repository;

import com.example.first.demo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface customerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findById(Customer customerId);
}
