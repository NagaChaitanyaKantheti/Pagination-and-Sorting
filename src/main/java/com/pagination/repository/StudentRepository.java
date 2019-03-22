package com.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagination.model.StudentInfo;


public interface StudentRepository extends JpaRepository<StudentInfo,Long> {

}
