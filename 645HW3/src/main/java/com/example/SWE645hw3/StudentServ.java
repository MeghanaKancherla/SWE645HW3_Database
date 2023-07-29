package com.example.SWE645hw3;

import java.util.List;

public interface StudentServ {
	StudentEntity saveStudent(StudentEntity student);
	List<StudentEntity> getAllStudents();
	StudentEntity getStudentById(long id);
	StudentEntity updateStudent(StudentEntity student, long id);
	void deleteStudent(long id);


}
