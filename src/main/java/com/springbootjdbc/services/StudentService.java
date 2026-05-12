package com.springbootjdbc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjdbc.dao.StudentRepository;
import com.springbootjdbc.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	public String saveStudent() {
		Student std = new Student("Vijay", 80);
		Student student = studentRepository.save(std);
		return student.getStudentName();
		
	}
	
	
	public Student getStudent(int id) {
		Optional<Student> byId = studentRepository.findById(id);
		Student student = byId.get();
		return student;
	}

	
	public List<Student> getAllStudent(){
		List<Student> all = studentRepository.findAll();
		return all;
	}
	
	public String delete(int id) {
		Student student = studentRepository.findById(id).get();
		System.out.println(student);
		studentRepository.delete(student);
		return "deleted"+ student.getStudentName();
	}
}
