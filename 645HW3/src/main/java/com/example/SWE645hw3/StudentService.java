package com.example.SWE645hw3;

import java.util.List;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(long id);
	Student updateStudent(Student student, long id);
	void deleteStudent(long id);


}
