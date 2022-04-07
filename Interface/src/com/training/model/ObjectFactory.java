package com.training.model;

public class ObjectFactory {

	public AutoMobile getObject(int key) {
		AutoMobile obj=null;
		
		switch (key) {
		case 1:
			obj=new MarutiCar();
			break;
			
		case 2:
			obj= new ToyotaCar();
			break;

		default:
			break;
		}
		
		return obj;
	}
}
