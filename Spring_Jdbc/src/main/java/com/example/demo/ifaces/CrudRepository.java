package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;



@Repository
public interface CrudRepository<T> {
	
	public int add(T t);
	public List<T> findAll();
	

	public int update(T t);
	public int remove(int id);
	Optional<T> findById(int t);
	
//	public Optional<T> findById1(int t);
	

}
