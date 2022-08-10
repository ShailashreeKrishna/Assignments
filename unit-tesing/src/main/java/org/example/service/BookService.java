package org.example.service;

import java.util.*;

import org.example.model.Book;

/**
 * @author Shailashree.S
 * 
 */



public class BookService {
	


private  List<Book> bookList;
 
 //to run the code successfully add this
   public BookService() {
	super();
	// TODO Auto-generated constructor stub
	this.bookList=new ArrayList<>();
}


//     public List<Book> getBookList(){
//	   return this.bookList;
// }
     public List<Book> getBookList(){
    	 return  this.bookList;
     } 
     
     public int addBook(Book book) {
         
    	  return this.bookList.add(book)?0:1;
         
     }


	public boolean removeBook(Book book) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(this.bookList.contains(book)) {
		 this.bookList.remove(book);
		 result=true;
	}else {
		throw new RuntimeException("invalid Number");
	}
		return result;  
}
	
public List<String> getBestBook(){
	List<String> list=Arrays.asList("FaceBook","Java","Head First Java");
	return list;
}
}
	
