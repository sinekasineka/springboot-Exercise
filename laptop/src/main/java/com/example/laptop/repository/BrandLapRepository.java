package com.example.laptop.repository;

import com.example.laptop.entity.BrandLap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BrandLapRepository  extends JpaRepository<BrandLap,Integer> {
}
