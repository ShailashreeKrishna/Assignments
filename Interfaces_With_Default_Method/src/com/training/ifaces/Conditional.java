package com.training.ifaces;

import java.util.function.Predicate;

@FunctionalInterface

public interface Conditional<T> {
	
	public boolean test(T t);
	
	public default boolean negate(Double value) {
		
			
		return value>=80;
		
	}
	
	//to create static method
	public static String getMessage() {//from java8 public is optional
		return "Static Method in Interface--Yes It's Real";
	}

}
