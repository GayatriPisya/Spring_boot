package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

	 @GetMapping("/students")
	    public List<Student> getAllStudents() {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Pisya Gayatri","Computer Science",90));
	        students.add(new Student("Tulugu Kishore Babu", "Computer Science",95));
	        students.add(new Student("Modi Sireesha","Computer Science",90));

	        return students;
}
}

