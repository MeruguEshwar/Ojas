package com.ojas.spring.bean;

public class Student {

	private String name;

	//Constructor Injection
	public Student(String name) {
		System.out.println("Student calling");
		this.name = name;
	}
	
	public void sdisplay(){
		System.out.println("sdisplay .."+name);
	}
}
