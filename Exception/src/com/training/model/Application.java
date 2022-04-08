package com.training.model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Customer obj=new Customer(106,"shree",657484937,"krish156");
//     System.out.println(obj.toString());
		
     Customer obj2=new Customer();
     
     try {
		obj2.setEmail("shree@SS365.in");
		System.out.println(obj2);
	} catch (InvalidEmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}


	
}
