package com.briup.ch01;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private Long id;
	private String name;
	private Integer age;
	private String address;
	
	//学生类中维护手机对象  1：n
	private Set<Phone> phone = new HashSet<Phone>();
	
	//学生类中维护班级对象  学生1-1班级
	private Clazz clazz;
	
	public Clazz getClazz() {
		return clazz;
	} 
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
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
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Set<Phone> getPhone() {
		return phone;
	}
	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Student(Long id, String name, Integer age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Student() {
	}
	
}
