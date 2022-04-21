package com.training.ifaces;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

public class BookServices implements CrudRespository {

	
	
	private ArrayList<Book>bookList;
	@Override
	public boolean add(Book book) {
		
		return bookList.add(book);
	}

	public BookServices() {
		super();
		this.bookList=new ArrayList<>();
		
	}

	@Override
	public Book findById(int id) {
		
		Book found = null;
		for (Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
			found = eachBook;
			}
			
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook, Book newBook) {
	
		if(this.bookList.contains(oldBook)) {
			//System.out.println("inside if block****");
			
			int idxPos = this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos,newBook);
					
		
		}
		return newBook;
	}
	
	
	public List<Book> findBooksGrtThan(double price){
		 return this.bookList.stream().filter(e ->e.getPrice()>price).collect(toList());
		
		
	}
	
	
public List<String> getBookNames(){
	return this.bookList.stream().map(e-> e.getBookName()).collect(toList());	
	}


public List<String> getBookNameGrtThanThanPrice(double price){
	
	return this.bookList.stream().filter(e->e.getPrice()>price).map(e->e.getBookName()).collect(toList());
}
   
public List<Book> sortedByName(){
	 return this.bookList.stream().sorted(Comparator.comparing(Book::getBookName)).collect(toList());
	
	
}

public List<Book> sortedByNumberDecending(){
	 return this.bookList.stream().sorted(Comparator.reverseOrder()).collect(toList());
	
	
}

	
	
	public List<Book> getBooksGrtThan (double price){
		List<Book> grtThanList = new ArrayList<>();
		Predicate<Double>grtThan =(value)->value>800.00;
		
		
		this.bookList.forEach(book->
		{
			double bookPrice = book.getPrice();
			if(grtThan.test(bookPrice)) {
		    grtThanList.add(book);
	     }
	});
	return grtThanList;
		}}
	