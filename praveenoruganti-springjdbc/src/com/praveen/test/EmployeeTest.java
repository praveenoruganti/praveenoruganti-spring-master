package com.praveen.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.praveen.config.AppConfig;
import com.praveen.model.Employee;
import com.praveen.service.EmployeeService;
import com.praveen.service.impl.EmployeeServiceImpl;

public class EmployeeTest {
	public static void main(String[] args) {
		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImpl.class);
			createEmployee(employeeService);
			// getEmployeeById(employeeService);
			// fetchAllEmployeesInfo(employeeService);
			// employeeService.updateEmployeeEmailById("mnp3pk1@gmail.com", 1);
			//employeeService.deleteEmployeeById(2);
		}
	}

	private static void fetchAllEmployeesInfo(EmployeeService employeeService) {
		List<Employee> empList = employeeService.getAllEmployeesInfo();
		for (Employee employee : empList) {
			System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployeeName() + "\t" + employee.getEmail()
					+ "\t" + employee.getGender() + "\t" + employee.getSalary());
		}
	}

	private static void getEmployeeById(EmployeeService employeeService) {
		Employee employee = employeeService.fetchEmployeeById(1);
		System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployeeName());
	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = Employee.builder().email("mnp3pk@gmail.com.com").employeeName("Praveen").gender("Male")
				.salary(190000.00).build();
		employeeService.addEmployee(employee);
	}

}
