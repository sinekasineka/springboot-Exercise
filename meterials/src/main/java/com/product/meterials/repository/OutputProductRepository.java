package com.product.meterials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.meterials.entity.OutputProduct;

@Repository

public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer>{

}