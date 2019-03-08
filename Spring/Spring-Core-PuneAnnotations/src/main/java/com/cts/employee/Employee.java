package com.cts.employee;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empId = 1024;
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
