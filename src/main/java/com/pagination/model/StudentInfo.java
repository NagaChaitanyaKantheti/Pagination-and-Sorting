package com.pagination.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentInfo {
	
	@Id
	private Long id;
	private String name;
	private Integer age;
	private String study;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", study=" + study + "]";
	}
	
	private StudentInfo(Long id, String name, Integer age, String study) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.study = study;
	}
	
	private StudentInfo() {
		super();
	}
	
	
	
}
