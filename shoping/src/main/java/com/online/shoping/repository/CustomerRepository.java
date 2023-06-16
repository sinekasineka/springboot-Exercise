package com.online.shoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.shoping.entity.Customer;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
