package com.praveen.spring.core.autowire.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.praveen.spring.core.autowire.annotations.bean.Address;
import com.praveen.spring.core.autowire.annotations.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com.praveen.spring.core.autowire.annotations")
public class EmployeeConfig {
	@Bean(name="myEmployee")
	public Employee getBean() {
		Employee emp= new Employee();
		Address addr= new Address();
		addr.setAddrId(102);
		addr.setLoc("HYD");
		emp.setAddress(addr);
		return emp;
	}

}
