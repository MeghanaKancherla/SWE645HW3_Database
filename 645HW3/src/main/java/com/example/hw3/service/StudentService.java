package com.example.hw3.service;

import java.util.List;

import com.example.hw3.model.Student;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(long id);
	Student updateStudent(Student student, long id);
	void deleteStudent(long id);

}
