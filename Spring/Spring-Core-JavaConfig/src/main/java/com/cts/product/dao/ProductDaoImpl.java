package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	public void saveProduct() {
		System.out.println("dao: ProductDaoImpl");
	}

}
