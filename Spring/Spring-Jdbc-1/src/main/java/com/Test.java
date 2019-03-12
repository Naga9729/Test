package com;

import java.util.List;

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
		
		//dao.saveProduct(prod);
		
		//Product product=dao.findById("10");
		
		/*
		if(product!=null) {
			
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			
		}else {
			System.out.println("Product Id does not exists");
		}
		*/
		
		List<Product> prods=dao.listAll();
		
		for(Product product:prods) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			System.out.println("-------------------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("--- done ");

	}

}
