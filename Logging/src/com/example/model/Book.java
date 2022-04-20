package com.example.model;

import java.util.logging.Logger;

public class Book implements Comparable<Book>{

		private int booknumber;
		private String bookName;
		private String author;
		private double price;
		
		public static Logger log=Logger.getLogger(Book.class.getName());
		public Book() {
			super();
			
			log.info("Book with Zero Argument Constructor");
		}
		public Book(int booknumber, String bookName, String author, double price) {
			super();
			this.booknumber = booknumber;
			this.bookName = bookName;
			this.author = author;
			this.price = price;
		}
		public int getBooknumber() {
			return booknumber;
		}
		public void setBooknumber(int booknumber) {
			this.booknumber = booknumber;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [booknumber=" + booknumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
					+ "]";
		}
		public int getBookNumber() {
			// TODO Auto-generated method stub
			return booknumber;
		}
		@Override
		public int compareTo(Book obj) {
			// TODO Auto-generated method stub
			if(obj.booknumber<this.booknumber) return -1;
			if(obj.booknumber>this.booknumber) return 1;
			
			return 0;
		}
		
	}
		



