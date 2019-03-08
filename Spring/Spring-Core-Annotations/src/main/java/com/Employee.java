package com;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private int empId = 10;
	private String empName = "Praveen";

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
