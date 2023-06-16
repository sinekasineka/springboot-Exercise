package com.stationery.stationery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stationery.stationery.entity.Stationery;

public interface StationeryRepository  extends JpaRepository<Stationery, Integer>{

}
