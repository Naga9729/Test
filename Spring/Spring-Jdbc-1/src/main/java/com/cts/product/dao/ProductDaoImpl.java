package com.cts.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		String qry = "select id,name,price,description from product where id=?";
		return jt.queryForObject(qry, new FindProductRowMapper(), id);
	}

	// find Product by name
	public List<Map<String, Object>> findByName(String name) {
		String qry = "select * from product where name like ?";
		return jt.queryForList(qry, name);
	}

	// listing all records
	
	public List<Product> listAll(){
		return jt.queryForObject("select * from product", new ListAllProductsRowMapper());
	}

	// display all records using rowmapper interface

}

// for getting single Product 
class FindProductRowMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p = null;

		p = new Product();
		p.setId(rs.getString("id"));
		p.setName(rs.getString("name"));
		p.setPrice(rs.getDouble("price"));
		p.setDescription(rs.getString("description"));

		return p;
	}

} // end of find product class

// for listing all products
class ListAllProductsRowMapper implements RowMapper<List<Product>>{

	public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {
		List<Product> prods=new ArrayList<Product>();
		while(rs.next()) {
		Product p=new Product();
		p.setId(rs.getString("id"));
		p.setName(rs.getString("name"));
		p.setPrice(rs.getDouble("price"));
		p.setDescription(rs.getString("description"));
		prods.add(p);
		}
		return prods;
	}
	
}















