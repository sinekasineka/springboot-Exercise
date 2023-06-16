package com.mobile.examble.repository;

import com.mobile.examble.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MobileRepository extends JpaRepository<Mobile,Integer> {

}
