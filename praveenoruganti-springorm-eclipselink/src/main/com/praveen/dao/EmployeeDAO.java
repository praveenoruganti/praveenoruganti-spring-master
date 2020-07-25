package com.praveen.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.praveen.entity.Employee;

@Repository
public class EmployeeDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void save(Employee employee) {
		entityManager.persist(employee);
		System.out.println("Employee is created...");
	}
	
	public void delete(Employee employee) {
		entityManager.remove(employee);
		System.out.println("Employee is deleted...");
	}
	
	public void update(Employee employee) {
		entityManager.merge(employee);
		System.out.println("Employee is deleted...");
	}

	public Employee getEmployee(int empId) {
		return entityManager.find(Employee.class,empId);
	}
}
