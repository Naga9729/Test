package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	public void saveProduct(Product product) {
		prodDao.saveProduct(product);
	}

	public Product findById(String prodId) {
		// db code yet to implement
		return prodDao.findById(prodId);
	}

	public void updateProduct(Product product) {
		prodDao.updateProduct(product);
	}
}
