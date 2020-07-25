package com.praveen.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	private int employeeId;
	private String employeeName;
	private String email;
	private Double salary;
	private String gender;

}
