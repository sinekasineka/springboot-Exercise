package com.storeRoom.storeRoom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stationery.stationery.entity.ProductDetails;
@Repository

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer>{

}
