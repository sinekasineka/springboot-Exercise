package com.mobileShop.mobileShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileShop.mobileShop.entity.Mobile;

@Repository

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
