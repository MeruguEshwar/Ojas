package com.ojas.spring.bean;

public class User {

	private int id;
	private String name;
	private String mail;
	
	public User(int id, String name, String mail) {
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
}
