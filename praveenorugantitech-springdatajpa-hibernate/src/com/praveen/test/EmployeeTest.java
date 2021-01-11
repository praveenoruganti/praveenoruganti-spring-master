package com.praveen.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.config.PersistenceJPAConfig;
import com.praveen.entity.Employee;
import com.praveen.service.EmployeeService;

public class EmployeeTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
		EmployeeService employeeService = container.getBean(EmployeeService.class);
		createEmployee(employeeService);
	    fetchAllEmployeesInfo(employeeService);
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
	
	private static void fetchAllEmployeesInfo(EmployeeService employeeService) {
		List<Employee> empList = employeeService.getAll();
		for (Employee employee : empList) {
			System.out.println(employee.getEmployee_Id() + "\t" + employee.getEmployee_Name() + "\t" + employee.getEmail()
					+ "\t" + employee.getGender() + "\t" + employee.getSalary());
		}
	}
}	
	