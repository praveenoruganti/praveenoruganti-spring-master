package com.praveen.spring.core.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean(name="employee")
	public Employee newEmployee() {
		Employee emp= new Employee();
		emp.setEmpId(149903);
		emp.setEmpName("Praveen");
		emp.setEmpSal(100000000d);
		
		return emp;
		
	}

}
