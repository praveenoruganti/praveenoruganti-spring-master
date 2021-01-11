package com.praveen.spring.core.di.constructor.xml;

public class CIDepartment {
	
	private String deptName;
	private int deptId;
	
	public CIDepartment(String deptName, int deptId) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	
	public int getDeptId() {
		return deptId;
	}
	

}
