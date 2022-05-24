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

@Data
@Entity
@Table(name="Shailu_User2")
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@Column(name="User_Id")
	int id;
	
	@Column(name="Name")
	String name;
	
	
	@Column(name="Phone_Number")
	long phoneNumber;

}
