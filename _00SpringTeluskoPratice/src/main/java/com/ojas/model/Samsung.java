package com.ojas.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		System.out.println("Octa 4g");
		cpu.process();
	}
}
