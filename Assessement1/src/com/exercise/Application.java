package com.exercise;

import java.io.ObjectInputStream.GetField;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		String[] list= {"1","5","2","1","2","6","7","1"};
		
		StringOperation operation=new StringOperation(list);
		
		System.out.println(operation.toString());
		
		System.out.println(operation.positionOf(1));
		
		System.out.println(operation.occurenceof(1));
	}
}

