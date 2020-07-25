package com.praveen.spring.core.di.circular.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.praveen.spring.core.di.circular.bean.Employee;

public class EmployeeTest {
	private static ApplicationContext context;

	public static void main(String[] args) throws Exception {

		context = new ClassPathXmlApplicationContext("beanscircular.xml");
		Employee cons = context.getBean("empObjCircular", Employee.class);
		System.out.println(cons);
	}

}
