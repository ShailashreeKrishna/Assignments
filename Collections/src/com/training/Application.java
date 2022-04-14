package com.training;

import java.util.List;

import com.training.ifaces.CrudRespository;
import com.training.model.Book;
import com.training.service.BookService;

public class Application {
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Book java= new Book(101,"Java","Shree",450);
		Book spring= new Book(102,"Spring","Mad",650);
		Book maven= new Book(103,"Maven","Harish",550);
		Book html= new Book(104,"Html","Priya",1450);
		Book python= new Book(105,"Python","Sathya",850);

		CrudRespository service = new BookService();
		System.out.println(service.add(java));
		System.out.println(service.add(spring));
		System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));

		List<Book> bookList = service.findAll();
		for(Book eachBook:bookList) {
			System.out.println(eachBook);
		}
		System.out.println("Greater than");
		List<Book> bookList1=((BookService)service).getBooksGrtThan(800);//this line is for java8
		bookList1.forEach(System.out::println);
		
		
		Book foundBook = service.findById(105);
		
		System.out.println("found Book"+foundBook);
		service.remove(python);
		
		System.out.println("=============");
		
		System.out.println(service.findAll());
		Book react=new Book(205,"ReactJS","Kiran",6850);
		service.add(react);
		System.out.println(service.findAll());
		Book reactNew=new Book(205,"ReactJS","Shree",3456);
		service.update(react,reactNew);
		System.out.println("======AFTER UPDATE==========");
		System.out.println(service.findAll());}


	
	}
	
	
	


