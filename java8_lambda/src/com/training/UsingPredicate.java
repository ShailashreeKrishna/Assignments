package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class UsingPredicate {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		Predicate<String> containsChar=(country)->country.toUpperCase().startsWith("I");
		
		Consumer<String> consumer=(value)->//System.out.println(value);
		{
			if(containsChar.test(value)) {
				System.out.println(value);
			}
		};
				names.forEach(consumer);//consumer is not a variable ,it return the value of consumer
			//	names.forEach((value)->System.out.println(value));
				
				//in lambda expression {}is optional
				//for more than one statement {}is necessary
				//to check whether the country start with I or not
				
				
	}

}
