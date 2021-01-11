package com.praveen.spring.core.di.circular.bean;

public class Address {
	private Employee emp;

	public Address() {
		super();
		System.out.println("In Address Default Constructor");
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
		System.out.println("In Address class , Employee setter");
	}

}
