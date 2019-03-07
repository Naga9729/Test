package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e1 = (Employee) ac.getBean("emp");
		Employee e2 = (Employee) ac.getBean("emp");
		Employee e3 = (Employee) ac.getBean("emp");
		Employee e4 = (Employee) ac.getBean("emp");

		e3.setEmpId(222);
		e4.setEmpId(555);
		System.out.println("E1: "+e1.getEmpId());
		e2.setEmpId(1212);
		System.out.println("E1: "+ e1.getEmpId());
		System.out.println("E2: "+e2.getEmpId());
		System.out.println("E3: "+e3.getEmpId());
		System.out.println("E4: "+e4.getEmpId());

		ac.registerShutdownHook();
		
		
		

	}

}
