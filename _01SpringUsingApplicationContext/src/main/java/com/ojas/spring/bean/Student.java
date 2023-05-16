package com.ojas.spring.bean;

public class Student {

	private String FirstName;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	
//	public Student(String firstName) {
//		super();
//		FirstName = firstName;
//	}

	public void display(){
		System.out.println("Welcome to mr."+FirstName);
	}
	
}
