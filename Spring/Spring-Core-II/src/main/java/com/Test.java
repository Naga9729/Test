package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean(Employee.class);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());

		System.out.println(emp.getProj().getProjId());
		System.out.println(emp.getProj().getProjName());
		System.out.println(emp.getProj().getLoc());

	}

}
