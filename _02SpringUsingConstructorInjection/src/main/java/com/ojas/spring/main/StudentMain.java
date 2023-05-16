package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.bean.Employee;
import com.ojas.spring.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("hi am eshwar");
		Student std = context.getBean(Student.class);
		std.display();
		
		Employee emp = context.getBean(Employee.class);
		emp.treet();
	}

}
