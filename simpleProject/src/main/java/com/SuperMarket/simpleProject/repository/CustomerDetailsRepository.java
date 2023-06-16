package com.SuperMarket.simpleProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.simpleProject.entity.CustomerDetails;

@Repository

public interface CustomerDetailsRepository  extends JpaRepository<CustomerDetails, Integer>{

}
