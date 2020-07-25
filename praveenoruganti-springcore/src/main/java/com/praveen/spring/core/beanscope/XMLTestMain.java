package com.praveen.spring.core.beanscope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.praveen.spring.core.di.lookupmethod.TokenMachine;

public class XMLTestMain {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanslookupmethod.xml");
		TokenMachine machine = (TokenMachine) context.getBean("tokenMachine");
		machine.findToken();
		machine = (TokenMachine) context.getBean("tokenMachine");
		machine.findToken();
		context.close();
	}
}
