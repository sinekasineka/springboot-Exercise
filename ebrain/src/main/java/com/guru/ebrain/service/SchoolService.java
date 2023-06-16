package com.guru.ebrain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guru.ebrain.dto.SchoolDto;
import com.guru.ebrain.dto.StudentDto;
import com.guru.ebrain.entity.School;
import com.guru.ebrain.entity.Student;
import com.guru.ebrain.repository.SchoolRepository;
import com.guru.ebrain.repository.StudentRepository;

@Service
public class SchoolService {
	@Autowire d
	SchoolRepository schoolrepository;
	@Autowired
	 StudentRepository studentRepository;
	
	public void save(SchoolDto schooldto) {
	School school=new School();
	school.setName(schooldto.getName());
	school.setAddress(schooldto.getAddress());
	
	schoolrepository.save(school);
	List<Student> list=new ArrayList<>();
	for(StudentDto studentdto:schooldto.getStudentlist()) {
		Student student=new Student();
		student.setName(studentdto.getName());
		student.setId(schooldto.getId());
		student.setAddress(studentdto.getAddress());
		list.add(student);
	}
	school.setLists(list);
	schoolrepository.save(school);
	
	}
	
}


