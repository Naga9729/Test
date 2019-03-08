package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.employee.Employee;

public class Test {

	public static void main(String[] args) {
		
		// Notes
		// AppConfig class should have @ComponentScan annotation
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp=ac.getBean(Employee.class);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		
		
		
	}

}
