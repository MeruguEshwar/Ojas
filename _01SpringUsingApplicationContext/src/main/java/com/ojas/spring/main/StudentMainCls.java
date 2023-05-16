package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.bean.Student;

public class StudentMainCls {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Hi Eshwar..");
		Student student = context.getBean(Student.class);
		student.display();
	}

}
