package com.school.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.school.entity.Address;


@Repository

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
