package com.praveen.spring.core.di.constructor.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.praveen.spring.core.di.constructor.annotation.CIDepartment;
import com.praveen.spring.core.di.constructor.annotation.CIEmployee;

@Configuration
public class CIEmployeeConfig {

	@Bean(name="ciemployee")
	public CIEmployee ciemployee(){	
		CIDepartment dept= new CIDepartment("Tech",1000);		
		CIEmployee emp= new CIEmployee("Praveen",149903,10000000d,dept);		
		return emp;
	}
}
