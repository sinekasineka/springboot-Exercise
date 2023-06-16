package com.collage.principal.repository;

import com.collage.principal.entity.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface principalRepository extends JpaRepository<Principal,Integer> {

}
