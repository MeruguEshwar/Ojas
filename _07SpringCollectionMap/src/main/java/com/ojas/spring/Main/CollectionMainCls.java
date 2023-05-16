package com.ojas.spring.Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ojas.spring.bean.BussinessLogic;

public class CollectionMainCls {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BussinessLogic bus = (BussinessLogic) context.getBean("e2");
		bus.display();
	}

}
