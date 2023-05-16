package com.ojas.bean.list;

import java.util.Iterator;
import java.util.List;

public class Product {
	
	private int id;
	private String Quation;
	private List<String> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuation() {
		return Quation;
	}

	public void setQuation(String quation) {
		Quation = quation;
	}

	public List getAnswers() {
		return answers;
	}

	public void setAnswers(List answers) {
		this.answers = answers;
	}

	public void display(){
		System.out.println("The Product id is:"+id);
		System.out.println("The question name is:"+Quation);
		
		Iterator<String> it = answers.iterator();
		while(it.hasNext()){
			System.out.println(it.next());}
	}
}
