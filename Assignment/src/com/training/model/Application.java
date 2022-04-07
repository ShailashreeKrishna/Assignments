package com.training.model;

import com.training.MobileBill;
import com.training.model.Address;
public class Application extends MobileBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address place = new Address(293,"ANNA STREET","CHENNAI");
		MobileBill detail = new MobileBill("Shree",6383001334L,"postpaid",place);
		System.out.println("NAME:"+detail.getCustomerName());
		System.out.println("MOBILENUMBER:"+detail.getMobileNumber());
		
		System.out.println("PLAN:"+detail.getPlanName());
		System.out.println("ADDRESS:"+detail.getAddress());
		
		System.out.println(MobileBill.BRAND_NAME);	
		System.out.println("amount="+detail.findAmount());
	}
	

}

