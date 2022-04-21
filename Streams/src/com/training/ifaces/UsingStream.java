package com.training.ifaces;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

import java.io.ObjectInputStream.GetField;


public class UsingStream {

	
	public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
		
		
	}
	
	public static void collectToSet(List<Book> bookList) {
	
		Set<Book> bookSet=bookList.stream().filter(e->e.getPrice()>900).collect(toSet());
		
		bookSet.forEach(System.out::println);//::->method modifier
	}
	
	public static void collectToMap(List<Book> bookList) {
		//if we interchange name and price it will print
		//but there is difficulties
		//the key must be unique in map
		
		
		Map<String,Double> values=bookList.stream().filter(e->e.getPrice()>300).distinct().collect(toMap(Book::getBookName,Book::getPrice));
		 
		values.forEach((key,value)->System.out.println(key+","+value));
		
	}
	
	public static void findMaxPrice(List<Book> bookList) {
		
		Optional<Book> optional=bookList.stream().max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Maximum Price:"+optional.get().getPrice());
		}
		}
	
	public static void findMinPrice(List<Book> bookList) {
		Optional<Book> optional=bookList.stream().min(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Minimum price:"+optional.get().getPrice());
		}
	}
	
	public static void count(List<Book> bookList) {
		long result=bookList.stream().filter(e->e.getBookName().contains("v")).count();
		System.out.println("Count:"+result);
		 
		

		
		
	

	}
	
	
	public static void count(List<Book> bookList,String srchstring) {
		long result=bookList.stream().filter(e->e.getBookName().contains(srchstring)).count();
		System.out.println(srchstring+" "+"Occurs:"+" "+result+" "+"times");}
		 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java= new Book(101,"Java","Shree",450);
		Book spring= new Book(102,"Spring","Mad",650);
		Book maven= new Book(103,"Maven","Harish",550);
		Book html= new Book(104,"Html","Priya",1450);
		Book python= new Book(105,"Python","Sathya",850);
		Book java1= new Book(101,"Java","Shree",450);
		Book spring1= new Book(102,"Spring","Mad",650);
		
		List<Book> bookList=Arrays.asList(java,spring,maven,html,python,java1,spring1);
		//set does not allow duplicate but in list it is possible so we are using distinct method
		//useDistinct(bookList);//create hashcode and equal method in book class to print output

		
		//collectToSet(bookList);//list to set
		
		//collectToMap(bookList);
		
		//findMaxPrice(bookList);
		
		//to call all the method
		int key=7;
		switch (key) {
		case 1:
			useDistinct(bookList);
			break;
		case 2:
			collectToSet(bookList);break;
		case 3:
			collectToMap(bookList);break;
		case 4:
			findMaxPrice(bookList);break;
			
		case 5:
			findMinPrice(bookList);break;
		case 6:
			count(bookList);break;
		case 7:
			count(bookList,"v");
		default:
			break;
		}
		
		
	
	}

}
