package com.training;
import java.util.*;

import com.training.ifaces.CrudRespository;
import com.training.model.Book;
import com.training.service.BookService;
import com.training.utils.BookNameComparator;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Kiran");
		names.add("Shree");
		names.add("Priya");
		names.add("Baviya");
		names.add("Harish");
		
		Collections.sort(names);
		System.out.println(names);
		
		Book java= new Book(101,"Java","Shree",450);
		Book spring= new Book(102,"Spring","Mad",650);
		Book maven= new Book(103,"Maven","Harish",550);
		Book html= new Book(104,"Html","Priya",1450);
		Book python= new Book(105,"Python","Sathya",850);
		CrudRespository service = new BookService();
		System.out.println("Is added:"+service.add(java));
		service.add(spring);
	service.add(maven);
		service.add(python);
		service.add(html);
//		System.out.println(service.add(java));
//		System.out.println(service.add(spring));
//		System.out.println(service.add(maven));
//		System.out.println(service.add(html));
//		System.out.println(service.add(python));
		List<Book> bookList=service.findAll();
		Collections.sort(bookList);
		
		System.out.println(("sort by Book Number"));
		System.out.println(bookList);
		Collections.sort(bookList,new BookNameComparator() );
		System.out.println("Sort by Book Name");
		System.out.println(bookList);
		
		
	}


}
