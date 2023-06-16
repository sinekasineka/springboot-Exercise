package com.online.shoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.shoping.entity.OnlineShopping;


@Repository

public interface OnlineShoppingRepository extends JpaRepository<OnlineShopping, Integer>{





}
