package com.ojas.spring.bean;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car implements Vechile {

	@Override
	public void start() {
		System.out.println("Car started..");
	}

}
