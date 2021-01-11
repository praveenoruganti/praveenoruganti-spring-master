package com.praveen.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.praveen.spring.aop.service.EmployeeService;


@Configuration
@ComponentScan(basePackages = "com.praveen.spring.aop")
public class EmployeeConfig {
	@Bean(name="employeeService")
	public EmployeeService getBean() {		
		return new EmployeeService();
	}
	
}
