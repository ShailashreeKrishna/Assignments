package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subtype = new subtype
		//CurrencyConverter conv = new CurrencyConverter();
		//supertype = subtype
		Function conv = new CurrencyConverter();
		
	
		
		System.out.println(Function.COUNTER);
		double response = conv.apply(200);
		System.out.println(response);
//both the line 11&12 and line 14 are identical
		System.out.println(conv.apply(300));
		
		if(conv instanceof CheckCondition) {
			CheckCondition obj = (CheckCondition)conv;
			System.out.println("Is Discount Allowed:"+obj.test(300));
			
		}else {
			System.out.println("cannot be cast");
		}
		
		Conditional condObj= new DiscountCalculator();
		
		System.out.println(condObj.test(6000));
		System.out.println(condObj.negate(6000));
		
		
	}

}
