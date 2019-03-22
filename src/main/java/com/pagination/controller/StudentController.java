package com.pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pagination.model.PageRequestDTO;
import com.pagination.model.StudentInfo;
import com.pagination.repository.StudentRepository;
import com.pagination.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/students")
	public void storeStudents(@RequestBody List<StudentInfo> students) {
		studentRepository.saveAll(students);
	}
	
	@GetMapping("/students")
	public List<StudentInfo> getStudents(@RequestBody PageRequestDTO pageRequestDTO){
		return studentService.getStudents(pageRequestDTO);
		
	}
	
}
