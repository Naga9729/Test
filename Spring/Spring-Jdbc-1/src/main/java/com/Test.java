package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDaoImpl dao=ac.getBean(ProductDaoImpl.class);
		
		Product prod=new Product();
		prod.setId("P005");
		prod.setName("Charger");
		prod.setPrice(1500);
		prod.setDescription("Wireless");
		
		dao.saveProduct(prod);
		
		System.out.println("--- done ");

	}

}
