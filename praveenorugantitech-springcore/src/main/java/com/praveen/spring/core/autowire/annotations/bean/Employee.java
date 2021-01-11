package com.praveen.spring.core.autowire.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;

	public Employee() {
		super();
		System.out.println("In default");
	}
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("in Param");
	}

	public Address getAddress() {
		return address;
	}
    
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [addr=" + address + "]";
	}

}
