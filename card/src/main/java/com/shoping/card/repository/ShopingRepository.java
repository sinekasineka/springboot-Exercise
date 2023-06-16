package com.shoping.card.repository;


import com.shoping.card.entity.Shoping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopingRepository extends JpaRepository<Shoping,Integer> {


}
