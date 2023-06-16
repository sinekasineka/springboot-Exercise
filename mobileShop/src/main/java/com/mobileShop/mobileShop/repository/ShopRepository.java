package com.mobileShop.mobileShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileShop.mobileShop.entity.Shop;

@Repository

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
