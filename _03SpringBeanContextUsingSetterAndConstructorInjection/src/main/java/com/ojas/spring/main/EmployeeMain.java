package com.ojas.spring.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ojas.spring.bean.Employee;
import com.ojas.spring.bean.Student;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Resource res = new FileSystemResource("D:\\Spring\\_03SpringBeanContextUsingSetterAndConstructorInjection\\src\\main\\resources\\spring.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		System.out.println("cls loaded..");
		Employee emp = factory.getBean(Employee.class);
		//emp.display();
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Student std = context.getBean(Student.class);
//		std.sdisplay();
	}

}
