package com.cts.product.dao;

import org.springframework.stereotype.Repository;

import com.cts.product.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	public void saveProduct(Product product) {
		System.out.println("Dao: Saving " + product.getProdName());
	}

	public Product findById(String prodId) {
		// db code yet to implement
		return null;
	}

	public void updateProduct(Product product) {
		System.out.println("Dao: Updating product");
	}

}
