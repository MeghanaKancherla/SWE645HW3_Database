package com.example.hw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hw3.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
