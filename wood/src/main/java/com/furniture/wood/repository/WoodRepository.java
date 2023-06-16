package com.furniture.wood.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furniture.wood.entity.Wood;

@Repository

public interface WoodRepository extends JpaRepository<Wood, Integer> {

}
