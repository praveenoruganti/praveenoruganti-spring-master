package com.praveen.spring.core.autowire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.praveen.spring.core.autowire.bean.Employee;

public class EmployeeTest {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beansautowire.xml");
		Employee obj = (Employee) context.getBean("empObj");
		System.out.println(obj);

	}

}
