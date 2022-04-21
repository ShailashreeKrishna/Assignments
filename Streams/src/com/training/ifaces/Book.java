package com.training.ifaces;


public class Book implements Comparable<Book>{

	private int booknumber;
	private String bookName;
	private String author;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + booknumber;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (booknumber != other.booknumber)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
}
	

