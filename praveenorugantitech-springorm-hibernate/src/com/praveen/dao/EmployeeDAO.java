package com.praveen.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.praveen.entity.Employee;

@Configuration
public class EmployeeDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(Employee employee) {
		hibernateTemplate.save(employee);
		System.out.println("Employee is created...");
	}
	
	public void delete(Employee employee) {
		hibernateTemplate.delete(employee);
		System.out.println("Employee is deleted...");
	}
	
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
		System.out.println("Employee is deleted...");
	}

	public List<Employee> getAll() {
		return hibernateTemplate.loadAll(Employee.class);
	}
}
