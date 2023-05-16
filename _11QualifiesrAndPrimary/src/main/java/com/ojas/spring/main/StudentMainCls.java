package com.ojas.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.bean.Vechile;
import com.ojas.spring.config.ApplicationConfiguration;
import com.ojas.spring.scope.ScopeExaple;
import com.ojas.spring.service.ServiceCls;

public class StudentMainCls {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//		ServiceCls s = context.getBean(ServiceCls.class);
//		s.execute();
		
		ScopeExaple s = context.getBean(ScopeExaple.class);
		
		ScopeExaple s1= context.getBean(ScopeExaple.class);
		
		if(s==s1){
			System.out.println("single ton");
		}else{
			System.out.println("prototype");
		}
		
	}

}
