package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.dao.ProductDaoImpl;

public class Test {
	
	
	
	

	public static void main(String[] args) {

		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//TestServiceImpl test=ac.getBean(TestServiceImpl.class);
		ProductDaoImpl dao=ac.getBean(ProductDaoImpl.class);
		
		
		System.out.println("Count: "+dao.getProductsCount());
		
		
	}

}
