package com.praveen.spring.core.di.setter.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.praveen.spring.core.di.setter.annotation.SIDepartment;
import com.praveen.spring.core.di.setter.annotation.SIEmployee;

@Configuration
@ComponentScan(basePackages = {"com.praveen.spring.core.di.setter.annotation"})
public class SIEmployeeConfig {

	@Bean(name="siemployee")
	public SIEmployee siemployee(){
		SIEmployee emp= new SIEmployee();
		SIDepartment dept= new SIDepartment();
		dept.setDeptId(1000);
		dept.setDeptName("Tech");
		
		emp.setDept(dept);
		emp.setEmpId(149903);
		emp.setEmpName("Praveen");
		emp.setEmpSal(10000000d);
		return emp;
	}
}
