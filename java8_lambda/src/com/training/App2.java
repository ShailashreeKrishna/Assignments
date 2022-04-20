package com.training;
import java.util.List;
import java.util.Arrays;
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		
	//	names.forEach(value->System.out.println(value));
		
		//method reference 
		names.forEach(System.out::println);//not calling a metnod,passing a method as reference
		
		
	}
	}


