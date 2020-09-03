package com.shivam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.entity.Student;
import com.shivam.entity.StudentException;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/students")
	public List<Student> getStudentList() {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Shivam", "Aggarwal", 24));
		list.add(new Student("John", "Wick", 42));
		list.add(new Student("Bat", "Man", 40));
		list.add(new Student("Iron", "Man", 36));
		
		return list;
	}
	
	@GetMapping("/students/{student_id}")
	public Student getStudent(@PathVariable("student_id") int id) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Shivam", "Aggarwal", 24));
		list.add(new Student("John", "Wick", 42));
		list.add(new Student("Bat", "Man", 40));
		list.add(new Student("Iron", "Man", 36));
		
		if(id<0 || id>=list.size()) {
			throw new StudentException("Student ID not found - "+id);
		}
		
		return list.get(id);
	}
	
	
}
