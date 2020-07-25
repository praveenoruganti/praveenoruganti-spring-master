package com.praveen.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.spring.aop.config.EmployeeConfig;
import com.praveen.spring.aop.service.EmployeeService;

public class EmployeeTest {

	private static ApplicationContext context;

	public static void main(String args[]) {

		context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		System.out.println("---------------------------------------");

		EmployeeService employeeService = context.getBean(EmployeeService.class);

		employeeService.addEmployee();

		employeeService.modifyEmployee();

		employeeService.deleteEmployee();
	}

}
