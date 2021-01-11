package com.praveen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.praveen.dao.EmployeeDAO;
import com.praveen.entity.Employee;

@Service("employeeService")
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	public Employee getEmployee(int empId) {
		return employeeDAO.getEmployee(empId);

	}
}
