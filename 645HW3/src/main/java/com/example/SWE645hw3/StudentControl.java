package com.example.SWE645hw3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentControl {
	
	@Autowired
	private StudentServ studentService;

	public StudentControl(StudentServ studentService) {
		super();
		this.studentService = studentService;
	}
	
	@PostMapping
	public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student){
		return new ResponseEntity<StudentEntity>(studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<StudentEntity> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") long studentId){
		return new ResponseEntity<StudentEntity>(studentService.getStudentById(studentId), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<StudentEntity> updateStudent(@PathVariable("id") long id, @RequestBody StudentEntity student){
		return new ResponseEntity<StudentEntity>(studentService.updateStudent(student, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
		studentService.deleteStudent(id);	
		
		return new ResponseEntity<String>("Employee deleted successfully.", HttpStatus.OK);
		
	}

}
