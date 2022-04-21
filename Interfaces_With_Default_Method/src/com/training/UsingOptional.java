package com.training;

import java.util.Optional;

public class UsingOptional {
	
	//creating a one more method
	public static Optional<String> getValue(int key){
		Optional<String> response =Optional.empty();
		
		if(key==1) {
			response=Optional.of("Hi");
		}
		return response;
	}
	
	public static Object getString(int key) {
		
		switch (key) {
		case 1:
			
			return new String("Chocobar");
			
		case 2:
			
			return new StringBuffer("BlackCurrent");
			

		default:
			
			return null;
		}
	}

	public static void main(String[] args) {
		
		//will throw null pointer exception for values3 and above
		
		//System.out.println(getString(3).toString());
		
		//to avoid null pointer exception and return a defult value

		//new feature of java8 optional is used
		
		Optional<Object> optional=Optional.ofNullable(getString(3));
		//it replace null value to butterscotch
		System.out.println(optional.orElse("ButterScotch").toString());
		//toString return String value of String Buffer because StringBuffer is muttable, string is immutable
		
		
		//another way
		Optional<Object> opt2=Optional.ofNullable(getString(3));
		
		if(opt2.isPresent()) {
			System.out.println("Value is present"+" "+opt2.get());
			
		}
		else {
			System.out.println("Value is not Present");
		}
		
		//using the Lambda Expression with Optional
//		Optional<Object> opt3=Optional.ofNullable(getString(3));
//		
//		opt3.orElseThrow(
//				()->new RuntimeException("No object for value 3 try again"));
//		
	
	
	//call the getValue Method by passing 1 as argument
		//call the same method by passing 2 as argument
		//print result
	
	Optional<String> resp = getValue(2);
	
	if(resp.isPresent()) {
		System.out.println(resp.get().toString());
	}else {
		System.out.println("Invalid Choice");
	}
	
//use the same method but throw Exception
//	resp.orElseThrow(()->new RunTimeException("No String value is present"));
	resp.orElseThrow(null);
	
}
}
