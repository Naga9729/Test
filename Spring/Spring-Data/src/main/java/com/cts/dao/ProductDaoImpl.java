package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {
	
	@Autowired
	private JdbcTemplate jt;
	
	// Data base operations
	// two Types
	// 1. Single Row Operations
	//2. Multi row operations
	
	/*
	 * Notes
	 * ---------
	 * 1. Select Operations
	 * 	  3 interfaces
	 *    -------------
	 *    	-> RowMapper
	 *    	-> ResultSetExctractor
	 *    	-> RowCallbackHandler
	 * 2. Update Operations (DML Operations ) use method: query
	 * 	 insert
	 * 	 update
	 *   delete
	 */
	
	

	
	public int getProductsCount() {
		return jt.queryForObject("select count(*) from product", Integer.class); 
	}
	
	public void updateProduct() {
		String qry="update product set name='New Mac Book Pro' where id=?";
		jt.update(qry,"10");
		System.out.println("Dao: Updated ");
	}
	
	public void removeProduct() {
		String qry="delete from product where id=?";
		jt.update(qry,"10");
		System.out.println("Dao: Updated ");
	}
	
	public void saveProduct() {
		String qry="insert into product values(?,?,?,?)";
		jt.update(qry,"P002","Pen","23","Good");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
