package com.photoshop.photoshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoshop.photoshop.entity.Photos;

@Repository

public interface PhotosRepository extends JpaRepository<Photos, Integer> {

}
