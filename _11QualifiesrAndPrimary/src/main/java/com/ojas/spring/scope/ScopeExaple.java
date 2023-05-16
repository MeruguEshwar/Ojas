package com.ojas.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="Prototype")
public class ScopeExaple {

	public void greet(){
		System.out.println("ScopeExaple of greet method:");
	}
}
