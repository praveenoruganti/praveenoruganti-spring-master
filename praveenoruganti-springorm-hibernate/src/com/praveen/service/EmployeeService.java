package com.praveen.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.dao.EmployeeDAO;
import com.praveen.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	public List<Employee> getAll() {
		return employeeDAO.getAll();

	}
}
