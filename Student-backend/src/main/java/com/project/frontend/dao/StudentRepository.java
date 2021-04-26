package com.project.frontend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.frontend.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	

}
