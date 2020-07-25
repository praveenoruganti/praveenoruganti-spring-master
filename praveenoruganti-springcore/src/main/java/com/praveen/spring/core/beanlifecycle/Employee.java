package com.praveen.spring.core.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean, DisposableBean, BeanNameAware, BeanPostProcessor {

	private String empName;
	private int empId;
	private double empSal;

	Employee() {
		System.out.println("Employee Constructor invoked");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name + " bean has been initialized.");

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside post process before initialization: " + beanName);
		return bean;
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("Post Construct method invoked");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties Set method invoked");

	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside post process after initialization: " + beanName);
		return bean;
	}

	@PreDestroy
	public void customDestroy() throws Exception {
		System.out.println("Custom Destroy method invoked");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method  invoked");

	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "]";
	}

}
