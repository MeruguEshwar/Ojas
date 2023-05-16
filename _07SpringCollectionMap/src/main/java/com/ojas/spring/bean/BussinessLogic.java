package com.ojas.spring.bean;

import java.util.Map;

public class BussinessLogic {

	private int id;
	private String name;
	private Map<Answer, User> answer;

	public BussinessLogic(int id, String name, Map<Answer, User> answer) {
		this.id = id;
		this.name = name;
		this.answer = answer;
	}

	public void display() {
		System.out.println("Id is:" + id + ", " + "name is: "+name);
		for (Map.Entry m : answer.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
