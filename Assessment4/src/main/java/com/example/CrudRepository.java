package com.example;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
	
	public List<T> findAll();
	public Optional<PopulationDetails> findByPlace(String place1);
	public List<T> getCount();
	
	
	

}
