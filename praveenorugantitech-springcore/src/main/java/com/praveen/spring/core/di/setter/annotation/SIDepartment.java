package com.praveen.spring.core.di.setter.annotation;

import org.springframework.stereotype.Component;

@Component
public class SIDepartment {

	private String deptName;
	private int deptId;

	public SIDepartment() {

	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
