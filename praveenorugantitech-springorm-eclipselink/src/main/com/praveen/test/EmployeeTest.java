package com.praveen.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.entity.Employee;
import com.praveen.service.EmployeeService;
import com.praveen.utils.EntityManagerFactoryUtil;

public class EmployeeTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(
				EntityManagerFactoryUtil.class);
		EmployeeService employeeService = container.getBean("employeeService",EmployeeService.class);
		createEmployee(employeeService);
		getEmployee(employeeService);
		container.close();
	}
	
	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setEmail("mnp3pk1@gmail.com.com");
		employee.setEmployee_Name("Praveen");
		employee.setGender("Male");
		employee.setSalary(190000.00);

		employeeService.save(employee);
	}
	
	private static void getEmployee(EmployeeService employeeService) {
		Employee employee = employeeService.getEmployee(0);
			System.out.println(employee.getEmployee_Id() + "\t" + employee.getEmployee_Name() + "\t" + employee.getEmail()
					+ "\t" + employee.getGender() + "\t" + employee.getSalary());
	}
}	
	