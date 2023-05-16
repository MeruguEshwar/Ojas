package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.spring.Dao.EmployeeDao;
import com.ojas.spring.Dao.EmployeeDaoImpl;
import com.ojas.spring.bean.Employee;
import com.ojas.spring.config.Appconfiguration;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("s1");
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Appconfiguration.class);
		//ApplicationContext c=new AnnotationConfigApplicationContext(Appconfiguration.class);
		System.out.println("s2");
		EmployeeDao e=c.getBean(EmployeeDaoImpl.class);
	
	}
}
