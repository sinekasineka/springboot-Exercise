package com.student.details.service;

import com.student.details.entity.Student;
import com.student.details.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public String save(Student student) {
		studentRepository.saveAndFlush(student);
		return "ok";

	}
}
