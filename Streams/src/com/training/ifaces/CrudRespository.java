package com.training.ifaces;

import java.util.List;

public interface CrudRespository {
	
	public boolean add(Book book);
	public Book findById(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book oldBook, Book recentBook);
	

}
