package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.ifaces.BookRepository;

@Service
public class BookService {

	
	private BookRepository repos;

	
	@Autowired
	public BookService(BookRepository repos) {
		super();
		this.repos = repos;
	}
	
	
	public List<Book> findAll(){
		
		return this.repos.findAll();
	}
}
