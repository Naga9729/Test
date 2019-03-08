package com.cts.product.dao;

import com.cts.product.bean.Product;

public interface ProductDao {

	void saveProduct(Product product);

	Product findById(String prodId);

	void updateProduct(Product product);

}