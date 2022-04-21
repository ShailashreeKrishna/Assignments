package com.training.services;

public class ExceptionHandling {

	
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method requires three values to be passed[a,b,c]");
			// TODO Auto-generated catch block
			e.printStackTrace();//exception obj=e
			//printStackTrace() is a method
		}
	}
	public void usingNumberFormateException(String value) {
//		int age=0;
//		System.out.println(age);
	int age = 0;
	try {
		age = Integer.parseInt(value);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(age);
}
	public String underStandFinallyBlock() throws Exception {
		int denominator=0;
		try {
			System.out.println(4/denominator);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("denominator should not be zero");
			e.printStackTrace();
			//return "welcome";
			 throw new Exception();
		}
		finally {
		System.out.println("thank you");
		}
		System.out.println("bye");
		
		return "bye";
	}
}