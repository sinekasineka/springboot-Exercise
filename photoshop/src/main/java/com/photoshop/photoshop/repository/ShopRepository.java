package com.photoshop.photoshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoshop.photoshop.entity.Shop;

@Repository

public interface ShopRepository extends JpaRepository<Shop, Integer> {
	

}
