package com.cts.product.service;

import com.cts.product.bean.Product;

public interface ProductService {

	void saveProduct(Product product);

	Product findById(String prodId);

	void updateProduct(Product product);

}