package com.praveen.spring.aop.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public String addEmployee() {
		System.out.println("Add Employee ");
		return "Employee Praveen information is added successfully";
	}

	public void modifyEmployee() {
		System.out.println("Modify Employee");
	}

	public void deleteEmployee() {
		System.out.println("Delete Employee");
	}

}
