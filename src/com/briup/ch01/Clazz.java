package com.briup.ch01;

import java.util.HashSet;
import java.util.Set;

public class Clazz {
	private Long id;
	private String name;
	private String message;
	
	//在班级类中维护学生对象集合  班级 1-n 学生
	private Set<Student> stus = new HashSet<Student>();

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Set<Student> getStus() {
		return stus;
	}

	public void setStus(Set<Student> stus) {
		this.stus = stus;
	}

	public Clazz(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	public Clazz() {
	}

}
