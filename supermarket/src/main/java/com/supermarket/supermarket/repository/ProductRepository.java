package com.supermarket.supermarket.repository;

import com.supermarket.supermarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository <Product,Integer>{


}
