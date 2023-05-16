package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.bean.Triangle;

public class MainCls {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = context.getBean(Triangle.class);
		tr.draw();
	}

}
