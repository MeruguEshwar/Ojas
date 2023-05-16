package com.ojas.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ojas.spring.bean.Vechile;

@Component
public class ServiceCls {

	@Autowired
	@Qualifier("Car")
	private Vechile vechile;
	

	public void execute(){
		vechile.start();
	}
}
