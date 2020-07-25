package com.praveen.spring.core.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AnnotatedBeanScopeTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TokenMachine tokenMachine1 = (TokenMachine) context.getBean("tokenMachine");
		TokenMachine tokenMachine2 = (TokenMachine) context.getBean("tokenMachine");
		boolean areTokenMachineInstancesSame = tokenMachine1.equals(tokenMachine2);
		System.out.println(areTokenMachineInstancesSame); // print true
		Token token1 = (Token) context.getBean("token");
		Token token2 = (Token) context.getBean("token");
		boolean areTokenInstancesSame = token1.equals(token2);
		System.out.println(areTokenInstancesSame); // prints false		
		context.close();
	}
}
