package com.ojas.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ojas.spring.bean.Student;

@Configuration
@ComponentScan("com.ojas.spring")
public class ApplicationConfiguration {
	
	@Bean
	public Student getStudent(){
		return new Student();
	
	}

}
