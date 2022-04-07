package com.training.model;
import com.training.MobileBill;
import com.training.model.*;
public class Address {

	private int doornumber;
	private String streetname;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doornumber+""+this.streetname+""+this.city;
	}

	public Address(int doornumber, String streetname, String city) {
		super();
		this.doornumber = doornumber;
		this.streetname = streetname;
		this.city = city;
	}
	public int getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

	}
	
	
	
   
