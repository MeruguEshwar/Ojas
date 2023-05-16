package com.ojas.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Bike")
@Primary
public class Bike implements Vechile {

	@Override
	public void start() {
		System.out.println("bike Started....");
	}

}
