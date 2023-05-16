package com.ojas.bean.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ojas.bean.map.Emolpyee;

public class MainClass {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Product p = context.getBean(Product.class);
//		p.display();
		Resource r = new FileSystemResource("D:\\Spring\\_06SpringCollections\\src\\main\\resources\\spring.xml");
		System.out.println("done");
		XmlBeanFactory bean = new XmlBeanFactory(r);
		Emolpyee emp = bean.getBean(Emolpyee.class);
		emp.hello();
	}

}
