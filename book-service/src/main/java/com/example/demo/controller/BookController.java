package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookController {

	
	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(path="/books")
	
	public List<Book> getAll(){
		return this.service.findAll();
	}
	
}
