package com.ojas.spring.bean;

public class Student {

	private String name;

	//Constructor Injection
	public Student(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("Hi My name is:"+name);
	}
}
