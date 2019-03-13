package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringBootJdbcApplication.class, args);
		ProductDaoImpl dao=ac.getBean(ProductDaoImpl.class);
		
		Product prod=new Product();
		
		prod.setId("P1020");
		prod.setName("Projector");
		prod.setPrice(6534);
		prod.setDescription("HD projector");
		
	//	dao.saveProduct(prod);
		
		for(Product product:dao.listAll()) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			System.out.println("------------------------------------");
		}
		
		System.out.println("--- Done ");
		
		
	}

}
