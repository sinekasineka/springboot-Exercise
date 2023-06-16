package com.one.to.many.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.to.many.relationship.entity.Bikes;


@Repository

public interface BikesRepository extends JpaRepository<Bikes, Integer>{

}
