package com.training.ifaces;
import com.training.ifaces.Conditional;
public class Discountcalculator implements Conditional {

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value<=500;
	}

	

	@Override
	public boolean negate(int value) {
		// TODO Auto-generated method stub
		return value>500;
	}

}
