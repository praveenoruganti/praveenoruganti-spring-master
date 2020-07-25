package com.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.entity.Employee;

public interface EmployeeRepository extends JpaRepository < Employee, Long > {
	
}
