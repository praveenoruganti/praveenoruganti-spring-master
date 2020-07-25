package com.praveen.spring.core.di.constructor.xml.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.praveen.spring.core.di.constructor.xml.CIEmployee;

public class ConstructionInjectionTest {

public static void main(String[] args) {
		
		// Usage of BeanFactory
		
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beansconstructor.xml"));
		
		CIEmployee emp= (CIEmployee)factory.getBean("conemployee");
		
		System.out.println("Employee Id :"+emp.getEmpId());
		System.out.println("Employee Name :"+emp.getEmpName());
		System.out.println("Employee Salary :"+emp.getEmpSal());
		System.out.println("Employee Department ID :" + emp.getDept().getDeptId());
		System.out.println("Employee Department Name :" + emp.getDept().getDeptName());
		
		// Usage of ApplicationContext
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("beansconstructor.xml");
		CIEmployee emp1= (CIEmployee)context.getBean("conemployee");
		
		System.out.println("Employee1 Id :"+emp1.getEmpId());
		System.out.println("Employee1 Name :"+emp1.getEmpName());
		System.out.println("Employee1 Salary :"+emp1.getEmpSal());
		System.out.println("Employee1 Department ID :" + emp1.getDept().getDeptId());
		System.out.println("Employee1 Department Name :" + emp1.getDept().getDeptName());
		
		context.close();

	}

}

