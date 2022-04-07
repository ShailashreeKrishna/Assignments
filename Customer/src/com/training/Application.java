package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer list = new Customer("Shree","Chennai",7895042341L,689504758L,67891009L);
		System.out.println("Name:"+list.getName());
		System.out.println("Address:"+list.getAddress());
		System.out.println("Telephonenumber:"+list.getTelephoneNumber());
		System.out.println("Aadharnumber:"+list.getAadharNumber());
		System.out.println("Accountnumber:"+list.getAccountNumber());

	}

}
