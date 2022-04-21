package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>,AgeCondition<Double> {

	//generic does not allow primitive rather it use object(eg.<Double>)
	
	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		//completely overriding super type with custom type
		if(value<100) {
			return true;
		}else {
			return false;
		}
		
		//return AgeCondition.super.negate(value);
		
		//suppose we have to call both 
		
//		boolean result1=Conditional.super.negate(value);
//		boolean result2=AgeCondition.super.negate(value);
//		
//		if(result1&&result2) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}

}
