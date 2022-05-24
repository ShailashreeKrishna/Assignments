package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

@Table(name="SHREEBOOK")
public class Book {

	@Id
	@Column(name="book_number")
	int id;
	
	@Column(name="book_name")
	String bookName;
	
	@Column(name="author")
	String author;
	
	@Column(name="price")
	double price;
}
