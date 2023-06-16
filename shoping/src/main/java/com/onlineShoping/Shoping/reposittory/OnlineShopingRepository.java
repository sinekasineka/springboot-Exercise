package com.onlineShoping.Shoping.reposittory;


import com.onlineShoping.Shoping.entity.OnlineShoping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineShopingRepository extends JpaRepository<OnlineShoping,Integer> {
}
