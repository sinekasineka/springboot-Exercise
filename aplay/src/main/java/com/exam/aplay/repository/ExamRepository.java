package com.exam.aplay.repository;

import com.exam.aplay.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExamRepository extends JpaRepository<Exam,Integer> {
}
