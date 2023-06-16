package com.example.demo.repository;

import com.example.demo.entity.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepository extends JpaRepository<Fruits,Integer>{
}
