package com.praveen.spring.core.di.lookupmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TokenMachine machine = context.getBean(TokenMachine.class);
		machine.findToken();
		machine = context.getBean(TokenMachine.class);
		machine.findToken();
		context.close();
	}
}
