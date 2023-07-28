package com.example.SWE645hw3;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	public StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		Optional<Student> student = studentRepository.findById(id);
		
		if (student.isPresent()) {
			return student.get();
		}
		else {
			throw new NoResourceException("Student", "ID", id);
		}
	}

	@Override
	public Student updateStudent(Student student, long id) {
		Student existingStudent = studentRepository.findById(id).orElseThrow(
				() -> new NoResourceException("student", "Id", id));
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setStreetAddress(student.getStreetAddress());
		existingStudent.setCity(student.getCity());
		existingStudent.setState(student.getState());
		existingStudent.setZip(student.getZip());
		existingStudent.setPhoneNumber(student.getPhoneNumber());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setDateOfSurvey(student.getDateOfSurvey());
		existingStudent.setLikeCampus(student.getLikeCampus());
		existingStudent.setInterest(student.getInterest());
		existingStudent.setRecommend(student.getRecommend());;
		existingStudent.setRaffle(student.getRaffle());
		existingStudent.setComments(student.getComments());
		
		studentRepository.save(existingStudent);
		
		return existingStudent;
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.findById(id).orElseThrow(()->new NoResourceException("Student", "Id", id));
		
		studentRepository.deleteById(id);
	}

}

