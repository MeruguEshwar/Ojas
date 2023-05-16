package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.bean.Student;
import com.ojas.spring.config.ApplicationConfiguration;

public class StudentMainCls {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Student student = context.getBean(Student.class);
		student.display();
	}

}
