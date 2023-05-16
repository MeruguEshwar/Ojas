package com.ojas.spring.Main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ojas.spring.bean.Employee;

public class MainCls {

	public static void main(String[] args) {
		Resource res = new FileSystemResource("D:\\Spring\\_05SpringBeanInheritance\\src\\main\\resources\\spring.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		System.out.println("cls loaded..");
		
		Employee e1= (Employee) factory.getBean("emp");
		e1.show();
	}
	
}
