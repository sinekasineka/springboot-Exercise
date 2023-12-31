package com.guru.ebrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guru.ebrain.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
