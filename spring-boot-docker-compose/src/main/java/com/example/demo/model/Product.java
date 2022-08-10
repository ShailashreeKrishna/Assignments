package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

@Table(name="shree_product")
@Entity
public class Product {
	@Id
	@Column(name="id")
	int productId;
	
	@Column(name="name")
	String productName;
	
	@Column(name="rate")
	double rate;

}
