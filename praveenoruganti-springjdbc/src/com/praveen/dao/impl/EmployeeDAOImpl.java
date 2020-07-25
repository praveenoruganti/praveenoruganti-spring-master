package com.praveen.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.praveen.dao.EmployeeDAO;
import com.praveen.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDAOImpl(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		String SQL = "SELECT * FROM EMPLOYEE WHERE employee_id=?";
		Employee employee = this.jdbcTemplate.queryForObject(SQL, new EmployeeRowMapper(), employeeId);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL = "DELETE FROM EMPLOYEE WHERE employee_Id=?";
		int update = this.jdbcTemplate.update(SQL, employeeId);
		if (update > 0)
			System.out.println("Employee is deleted..");
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		String SQL = "UPDATE EMPLOYEE set email=? WHERE employee_Id=?";
		int update = this.jdbcTemplate.update(SQL, newEmail, employeeId);
		if (update > 0)
			System.out.println("Email is updated..");

	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		String SQL = "SELECT * FROM EMPLOYEE";
		return this.jdbcTemplate.query(SQL, new EmployeeRowMapper());
	}

	@Override
	public void createEmployee(Employee employee) {
		int update = this.jdbcTemplate.update(
				"INSERT INTO EMPLOYEE(employee_name,email,gender,salary) VALUES(?,?,?,?)",
				employee.getEmployeeName(), employee.getEmail(), employee.getGender(), employee.getSalary());
		if (update > 0)
			System.out.println("Employee is created...");
	}
}
