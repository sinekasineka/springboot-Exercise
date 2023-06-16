package com.one.to.many.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.to.many.relationship.entity.Store;

@Repository

public interface StoreRepository extends JpaRepository<Store, Integer>{

}
