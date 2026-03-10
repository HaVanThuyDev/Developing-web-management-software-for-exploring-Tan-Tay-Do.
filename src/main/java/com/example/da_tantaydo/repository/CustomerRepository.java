package com.example.da_tantaydo.repository;

import com.example.da_tantaydo.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface CustomerRepository extends JpaRepository<Customer, Long> {
}
