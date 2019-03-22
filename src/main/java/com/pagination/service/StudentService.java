package com.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pagination.model.PageRequestDTO;
import com.pagination.model.StudentInfo;
import com.pagination.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<StudentInfo> getStudents(PageRequestDTO pageRequestDTO) {
		Pageable pageable=PageRequest.of(pageRequestDTO.getPage(),pageRequestDTO.getSize(),Sort.by(pageRequestDTO.getSortBy()));
		Page<StudentInfo> pageData=studentRepository.findAll(pageable);
		List<StudentInfo> studentList=pageData.getContent();
		return studentList;
	}

}
