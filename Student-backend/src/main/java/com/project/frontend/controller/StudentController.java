package com.project.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.frontend.dao.StudentRepository;
import com.project.frontend.model.Student;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepo;
	
	@GetMapping("/studentslist")
	public List<Student> listOfStudents() {
		
		return studentRepo.findAll();
	}

}
