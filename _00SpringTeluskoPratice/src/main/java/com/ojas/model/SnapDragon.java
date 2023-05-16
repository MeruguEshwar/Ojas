package com.ojas.model;

import org.springframework.stereotype.Component;

@Component(value = "snap")
public class SnapDragon implements MobileProcessor{

	public void process() {
		System.out.println("Worlds best CPU:");
	}

}
