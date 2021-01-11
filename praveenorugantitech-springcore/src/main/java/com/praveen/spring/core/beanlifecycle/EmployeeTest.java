package com.praveen.spring.core.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp= (Employee)context.getBean("employee");
		System.out.println(emp);
		//Shut down event is fired when context.close() or context.registerShutdownHook() is invoked.
		context.close();
	}
}
