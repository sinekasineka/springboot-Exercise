package com.one.to.one.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.to.one.project.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
