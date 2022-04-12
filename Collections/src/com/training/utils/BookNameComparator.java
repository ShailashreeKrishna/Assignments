package com.training.utils;

import java.util.Comparator;

import com.training.model.Book;

public class BookNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book obj1, Book obj2) {
		// TODO Auto-generated method stub
		
		return (obj1.getBookName().compareTo(obj2.getBookName()));
	}

}
