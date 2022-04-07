package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//ObjectFactory factory = new ObjectFactory();
	
	NewObjectFactory factory = new NewObjectFactory();
	Conditional profObj=factory.getConditional(1);
	System.out.println("Allowance:"+factory.getValue(profObj, "chennai"));
	
	Conditional studObj=factory.getConditional(2);
	System.out.println("Allowance:"+factory.getValue(studObj,"30"));
	//System.out.println(object.test("chennai"));
	Conditional prinObj=factory.getConditional(3);
	System.out.println("Allowance:"+factory.getValue(prinObj,"government"));
	

	}

}
