package com.praveen.spring.core.di.circular.bean;

public class Employee {
	private Address addr;

	public Employee() {
		super();
		System.out.println("In Employee Default Constructor");
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
		System.out.println("In Employee class , Address setter");
	}
}
