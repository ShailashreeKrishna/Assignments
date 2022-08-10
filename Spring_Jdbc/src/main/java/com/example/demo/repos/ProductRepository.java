package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;



@Repository


public class ProductRepository implements CrudRepository<Product> {

	
	private JdbcTemplate template;
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
		
		
		String sql="insert into SHREE_PRODUCT1 values(?,?,?)";
		
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
		
	}

	@Override
	public List<Product> findAll() {
		
		
		String sql="select * from SHREE_PRODUCT1";
		
		
	return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

//	@Override
//	public Product findById(int id) {
//		// TODO Auto-generated method stub
//		try {
//			return template.queryForObject("select *from SHREE_PRODUCT1 where product_id=(?)",BeanPropertyRowMapper.newInstance(Product.class),id);
//		}catch(IncorrectResultSizeDataAccessException e) {
//			e.printStackTrace();
//			return null;
//		}
//		
//	}

	@Override
	public int update(Product t) {
		
		
		
		return template.update("update SHREE_PRODUCT1 set product_name=(?),price=(?) where product_id=(?)",
				        new Object[]{t.getProductName(),t.getPrice(),t.getProductId()});
	
	}
	@Override
	public int remove(int id) {
	
		
		return template.update("delete from SHREE_PRODUCT1 where product_id=(?)",id);

	}

	@Override
	public Optional<Product> findById(int id) {
		
	Optional<Product> obj = Optional.empty();
		       Product found= template.queryForObject(
		                "select * from SHREE_PRODUCT1 where  product_id = ?",
		               BeanPropertyRowMapper.newInstance(Product.class),id);
		       return Optional.of(found);
		    }


}
