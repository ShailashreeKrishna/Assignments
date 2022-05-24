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
@Table(name="Shailu_Credit_Card")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class CreditCard {
	
	@Id
	@Column(name="Card_Number")
	long cardNumber;
	
	@Column(name="Card_Holder_Name")
	String cardHolderName;
	
	@Column(name="Credit_Limit")
	double creditLimit;

}
