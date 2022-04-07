package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting grtObj = new Greeting();
		//System s = new System();the constructor of the class is private so we cannot used as object creation
		System.out.println(grtObj.getMessage());
		System.out.println("welcome");
		System.out.println(Greeting.getInfo());//class.method is a static way.
		System.out.println(grtObj.getMessage());
		//System.out.println(grtObj.getInfo());object.method it is a non static way.

	}

}
