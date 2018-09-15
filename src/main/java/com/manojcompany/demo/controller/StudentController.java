package com.manojcompany.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manojcompany.demo.entity.StudentEntity;
import com.manojcompany.demo.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/student")
	public StudentEntity createStudent(@Valid @RequestBody StudentEntity student) {
		return studentRepository.save(student);
	}
	
	@GetMapping("/student/{id}")
	public StudentEntity StudentId(@PathVariable(value="id") Integer StudentId) {
		return studentRepository.findById(StudentId)
				.orElseThrow(() -> new RuntimeException("Cannot find student"));
	}
}