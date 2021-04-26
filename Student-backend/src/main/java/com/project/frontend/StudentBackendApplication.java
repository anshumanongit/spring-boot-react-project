package com.project.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.frontend.dao.StudentRepository;
import com.project.frontend.model.Student;

@SpringBootApplication
public class StudentBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentBackendApplication.class, args);
	}
	
	@Autowired
	StudentRepository studentRepo;
	

	@Override
	public void run(String... args) throws Exception { 
		
		
		studentRepo.save(new Student("Ajay", "Commerce","Ajay@gmail.com"));
		studentRepo.save(new Student("Piyush", "Science","Piyushgarg@gmail.com"));
		studentRepo.save(new Student("Anshuman", "Biology","Anshuman@gmail.com"));
	}
	

}
