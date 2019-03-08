package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;

@Service("prodServce")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;

	public void saveProduct() {
		System.out.println("------ service");
		prodDao.saveProduct();
	}

	public void testMe() {
		System.out.println("--- testing");
	}

}
