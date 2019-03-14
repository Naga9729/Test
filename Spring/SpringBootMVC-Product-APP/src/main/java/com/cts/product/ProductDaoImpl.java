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

	// save Product
	public void saveProduct(Product prod) {
		String q1 = "insert into product(id,name,price,description) values(?,?,?,?)";
		jt.update(q1, prod.getId(), prod.getName(), prod.getPrice(), prod.getDescription());
		System.out.println("Dao: Product Saved to DB");
	}

	// list all records
	public List<Product> listAll() {
		return jt.queryForObject("select * from product", new ListAllProducts());
	}

	// find a product
	public Product findById(String id) {
		String q1 = "select id,name,price,description from product where id=?";
		return jt.queryForObject(q1, new FindProduct(), id);
	}

	// update Product
	public void updateProduct(Product product) {
		String q1 = "update product set name=?,price=?,description=? where id=?";
		jt.update(q1, product.getName(), product.getPrice(), product.getDescription(), product.getId());
		System.out.println("Dao: Updated");
	}

	// delete Product
	public void deleteProduct(String id) {
		String q1 = "delete from product where id=?";
		jt.update(q1, id);
		System.out.println("Dao: Deleted");

	}

} // end of dao class

class ListAllProducts implements RowMapper<List<Product>> {

	List<Product> prods = new ArrayList<>();

	@Override
	public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {

		do {
			Product prod = new Product();
			prod.setId(rs.getString("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));

			prods.add(prod);

		} while (rs.next());
		return prods;
	}

}// end of ListAllProducts claass

// for finding a product
class FindProduct implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product prod = new Product();
		prod.setId(rs.getString("id"));
		prod.setName(rs.getString("name"));
		prod.setPrice(rs.getDouble("price"));
		prod.setDescription(rs.getString("description"));

		return prod;
	}

}
