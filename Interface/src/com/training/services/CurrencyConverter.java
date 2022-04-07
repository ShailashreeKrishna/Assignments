package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;

//a class can only extend another class but it can implement an interface

// class Dummy extends Function{
//
//}
public  class CurrencyConverter implements Function,CheckCondition {

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>5000;
	}

}
