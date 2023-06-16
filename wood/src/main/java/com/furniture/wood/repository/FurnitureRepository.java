package com.furniture.wood.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furniture.wood.entity.Furniture;

@Repository

public interface FurnitureRepository extends JpaRepository<Furniture, Integer> {

}
