package com.praveen.spring.core.collections.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.praveen.spring.core.collections.bean.Employee;

public class SpringCollectionsTest {
	private static ApplicationContext context;

	public static void main(String[] args) throws Exception, Exception  {
		context = new ClassPathXmlApplicationContext("beanscollections.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp);
		
	}

}
