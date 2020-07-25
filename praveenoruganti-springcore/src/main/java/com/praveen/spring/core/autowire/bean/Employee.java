package com.praveen.spring.core.autowire.bean;

public class Employee {
	private Address address;

	public Employee() {
		super();
		System.out.println("In default");
	}

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
