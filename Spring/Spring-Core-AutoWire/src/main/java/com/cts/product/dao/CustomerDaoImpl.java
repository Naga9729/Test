package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository("custDao")
public class CustomerDaoImpl implements ProductDao {

	public void saveProduct() {
		System.out.println("Dao: CustomerDaoImpl..");
		
	}

}
