package com.ojas.spring.bean;

public class Employee {

	private String Addressname;

	public Employee(String addressname) {
		System.out.println("Employee calling..");
		Addressname = addressname;
	}
	
	public void display(){
		System.out.println("My name is:"+Addressname);
	}
	
}
