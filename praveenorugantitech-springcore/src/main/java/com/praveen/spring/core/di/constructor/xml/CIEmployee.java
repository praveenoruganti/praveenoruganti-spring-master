package com.praveen.spring.core.di.constructor.xml;

public class CIEmployee {

	private String empName;
	private int empId;
	private double empSal;
	private CIDepartment dept;

	public CIEmployee(String empName, int empId, double empSal, CIDepartment dept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.dept = dept;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public double getEmpSal() {
		return empSal;
	}

	public CIDepartment getDept() {
		return dept;
	}

}
