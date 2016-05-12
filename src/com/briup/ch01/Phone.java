package com.briup.ch01;

public class Phone {
	private Long id;
	private String name;
	private String type;
	private double price;
	
	//手机类维护学生对象  1:1
	private Student stu;
	
	public Phone() {
	}
	public Phone(String name, String type, double price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	

}
