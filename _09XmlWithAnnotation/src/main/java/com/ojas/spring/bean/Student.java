package com.ojas.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	@Value("Eshwar")
	private String FirstName;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	

	public void display(){
		System.out.println("Welcome to mr."+FirstName);
	}
	
}
