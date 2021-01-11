package com.praveen.spring.core.autowire.annotations.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.spring.core.autowire.annotations.bean.Employee;
import com.praveen.spring.core.autowire.annotations.config.EmployeeConfig;

public class EmployeeTest {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee obj = (Employee)context.getBean(Employee.class);
		System.out.println(obj);
		
		
	}

}
