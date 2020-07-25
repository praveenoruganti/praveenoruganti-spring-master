package com.praveen.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id	
	private int employee_Id;
	private String employee_Name;
	private String email;
	private Double salary;
	private String gender;
	
}
