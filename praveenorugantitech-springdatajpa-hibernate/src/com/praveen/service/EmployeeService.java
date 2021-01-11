package com.praveen.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.entity.Employee;
import com.praveen.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;
	@Transactional
	public void save(Employee employee) {
		employeeRepository.save(employee);
		System.out.println("Employee is created...");
	}
	
	public List<Employee> getAll(){
		return employeeRepository.findAll();
		
	}
}
