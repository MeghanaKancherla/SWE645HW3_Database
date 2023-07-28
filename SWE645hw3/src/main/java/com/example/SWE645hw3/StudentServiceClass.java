package com.example.SWE645hw3;

import java.util.List;

public interface StudentServiceClass {
	StudentClass saveStudent(StudentClass student);
	List<StudentClass> getAllStudents();
	StudentClass getStudentById(long id);
	StudentClass updateStudent(StudentClass student, long id);
	void deleteStudent(long id);


}
