package com.training.model;

import com.training.model.Insurance;
import com.training.model.VehicleInsurance;

public class Application {

	
	public static void printPremium(Insurance object) {
		
		System.out.println("Premium:"+object.calculatePremium());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInsurance car = new VehicleInsurance(1010,"ramesh","car",2019);

		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(10,"ageeju",45);
		
		printPremium(life);
		String[] illness= {"bp","sugar","cardiac arrest","ent"};
		HealthInsurance health = new HealthInsurance(1010,"ramesh",illness);
		
		printPremium(health);
	}

}
