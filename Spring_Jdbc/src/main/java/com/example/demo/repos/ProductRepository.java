package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

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
		// TODO Auto-generated method stub
		
		String sql="insert into SHREE_PRODUCT1 values(?,?,?)";
		
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
		String sql="select * from SHREE_PRODUCT1";
		
		
	return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		try {
			return template.queryForObject("select *from SHREE_PRODUCT1 where product_id=(?)",BeanPropertyRowMapper.newInstance(Product.class),id);
		}catch(IncorrectResultSizeDataAccessException e) {
			//e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int update(Product t) {
		// TODO Auto-generated method stub
		
		
		return template.update("update SHREE_PRODUCT1 set product_name=(?),price=(?) where product_id=(?)",
				        new Object[]{t.getProductName(),t.getPrice(),t.getProductId()});
	
	}
	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		
		return template.update("delete from SHREE_PRODUCT1 where product_id=(?)",id);

	}
//
//	@Override
//	public Optional<Product> findById1(int t) {
//		// TODO Auto-generated method stub
//		Optional<Product>obj=null;
//		if(obj.isPresent()) {
//
//   Product obj11= template.queryForObject("select *from SHREE_PRODUCT1 where product_id=(?)",BeanPropertyRowMapper.newInstance(Product.class),t);
//			System.out.println(obj11);
//		}else {
//	System.out.println("No product found") ;
//	}
//		return obj;
//
//	}

}
