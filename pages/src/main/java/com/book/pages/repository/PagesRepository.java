package com.book.pages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.pages.entity.Pages;

@Repository

public interface PagesRepository extends JpaRepository<Pages, Integer>{

}
