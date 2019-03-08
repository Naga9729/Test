package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.bean.Product;
import com.cts.product.config.AppConfig;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService ps=ac.getBean(ProductService.class);
		
		Product prod=new Product();
		prod.setProdId("P001");
		prod.setProdName("Book");
		prod.setPrice(76);
		
		ps.saveProduct(prod);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
