package com.ojas.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.ojas.model")
public class AppConfig {
	@Bean
	public Samsung getphone() {
		return new Samsung();
	}
	
	@Bean
	@Primary
	public MobileProcessor getProcessor() {
		return new SnapDragon();
	}
	
	@Bean

	public MediaTracker getTracker() {
		return new MediaTracker();
	}
}
 