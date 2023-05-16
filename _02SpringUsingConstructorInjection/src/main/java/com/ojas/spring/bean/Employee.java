package com.ojas.spring.bean;

public class Employee {

	private String Address;

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	public void treet(){
		System.out.println("Treet method.."+Address);
	}
}
