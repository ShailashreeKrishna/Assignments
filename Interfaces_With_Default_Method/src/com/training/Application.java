package com.training;

import com.training.ifaces.Conditional;
import com.training.services.StudentResultService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentResultService service=new StudentResultService();
		System.out.println("Is pass:"+service.test(98.00));
		
		
		System.out.println("Is Fail:"+service.negate(98.00));
		
		//for static method
		System.out.println(Conditional.getMessage());
	}

}
