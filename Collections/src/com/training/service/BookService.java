package com.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.training.ifaces.CrudRespository;
import com.training.model.Book;

public class BookService implements CrudRespository {
	private ArrayList<Book> bookList;
	

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
		}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		Book found =null;
		for(Book eachBook:this.bookList) {
			//using if condition
			if(eachBook.getBookNumber()==id) {
				 found=eachBook;
			}
		}
		
		
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook,Book newBook) {
		// TODO Auto-generated method stub
		if(this.bookList.contains(oldBook)) {
			//System.out.println("Inside IF BLOCK #######");
			int idxPos=this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, newBook);
		}
		
		return newBook;
	}
	public List<Book> getBooksGrtThan(double price){
		List<Book> grtThanList=new ArrayList<>();
		Predicate<Double>grtThan=(value)->value>800.00;
		
		this.bookList.forEach(book->
		{
			double bookPrice=book.getPrice();
			if(grtThan.test(bookPrice)) {
				grtThanList.add(book);
			}
		});
			
		return grtThanList;
		}

}
