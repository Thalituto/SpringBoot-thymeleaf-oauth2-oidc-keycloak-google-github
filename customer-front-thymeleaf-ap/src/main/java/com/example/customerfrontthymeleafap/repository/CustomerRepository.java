package com.example.customerfrontthymeleafap.repository;

import com.example.customerfrontthymeleafap.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
