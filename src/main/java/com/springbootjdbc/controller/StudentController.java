package com.springbootjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjdbc.model.Student;
import com.springbootjdbc.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/save")
	public String saveStudent() {
		String name = studentService.saveStudent();
		return name;
	}
	
	@GetMapping("/studentById")
	public Student getStudentById() {
		
		return studentService.getStudent(1);
		
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/deleteById")
	public String deleteStudent() {
		return studentService.delete(6);
		
	}
	
}
