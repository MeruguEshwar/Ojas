package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.bean.Student;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring Configuration Loaded...");
		Student student = context.getBean(Student.class);
		Student student1 = context.getBean(Student.class);
		Student student2 = context.getBean(Student.class);
		Student student3 = context.getBean(Student.class);
		student.display();

	}

}
