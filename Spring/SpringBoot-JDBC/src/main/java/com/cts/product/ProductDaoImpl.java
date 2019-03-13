package com.cts.product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {
	
	@Autowired
	private JdbcTemplate jt;
	
	public void saveProduct(Product prod) {
		
		String q1="insert into product(id,name,price,description) values(?,?,?,?)";
		jt.update(q1,prod.getId(),prod.getName(),
				prod.getPrice(),
				prod.getDescription());
		System.out.println("Dao: Product Saved to DB");
	}
	
	public List<Product> listAll(){
		return jt.queryForObject("select * from product", new ListAllProducts());
	}
	
} // end of dao class

class ListAllProducts implements RowMapper<List<Product>>{

	List<Product> prods=new ArrayList<>();
	@Override
	public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		do {
			Product prod=new Product();
			prod.setId(rs.getString("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));
			
			prods.add(prod);
			
		}while(rs.next());
		return prods;
	}
	
}















