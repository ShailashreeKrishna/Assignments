package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public interface CrudRepository<T> {
	
	public int add(T t);
	public List<T> findAll();
	
	public T findById(int id);
	public int update(T t);
	public int remove(int id);
	
//	public Optional<T> findById1(int t);
	

}
