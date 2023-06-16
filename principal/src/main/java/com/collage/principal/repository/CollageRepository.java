package com.collage.principal.repository;

import com.collage.principal.entity.Collage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CollageRepository extends JpaRepository<Collage,Integer> {
}
