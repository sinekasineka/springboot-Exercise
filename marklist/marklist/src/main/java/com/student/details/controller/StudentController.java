package com.student.details.controller;

import com.student.details.entity.Student;
import com.student.details.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/postStudentDetails")
	private String save(@RequestBody Student student) {
		studentService.save(student);
		return "ok";

	}

}
