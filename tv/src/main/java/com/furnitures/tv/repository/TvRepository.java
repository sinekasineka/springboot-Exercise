package com.furnitures.tv.repository;

import com.furnitures.tv.entity.Tv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TvRepository extends JpaRepository<Tv,Integer> {
}
