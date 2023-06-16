package com.product.meterials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.meterials.entity.RawMaterial;

@Repository

public interface RawMeterialRepository extends JpaRepository<RawMaterial, Integer>{
	

}
