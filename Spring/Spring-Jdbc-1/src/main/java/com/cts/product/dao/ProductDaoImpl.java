package com.cts.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl {

	@Autowired
	private JdbcTemplate jt;

	// Saving Product
	public void saveProduct(Product product) {
		String qry = "insert into product(id,name,price,description)values(?,?,?,?)";
		jt.update(qry, product.getId(), product.getName(), product.getPrice(), product.getDescription());
	}

	// find Product by Id
	public Product findById(String id) {
		String qry = "select * from product where id=?";
		return jt.queryForObject(qry, Product.class, id);
	}

	// find Product by name
	public List<Map<String, Object>> findByName(String name) {
		String qry = "select * from product where name like ?";
		return jt.queryForList(qry, name);
	}
	
	// display all records using rowmapper interface
	
	public List<Product> listAll(){
		String qry="select * from product";
		return (List<Product>) jt.queryForObject(qry, new ListProductsRowMapper());
	}
	
	// display all records using ResultsetExctaractor
	
	//public List<Product> listAll_v1(){
		
	//}
}

class ListProductsRowMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product product = new Product();
		if (rs.next()) {

			product.setId(rs.getString("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getDouble("price"));
			product.setDescription(rs.getString("description"));

		}

		return product;
	}

}
