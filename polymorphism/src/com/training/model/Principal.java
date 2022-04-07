package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {
 
	private String qualification;
	private String collegeName;
	private int Experience;
	
	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

	public Principal(String qualification, String collegeName, int experience) {
		super();
		this.qualification = qualification;
		this.collegeName = collegeName;
		Experience = experience;
	}

	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		String type = (String)value;
		boolean result=false;
		if(type.equals("autonomous")) {
			 result=true;
		}
		return result;
	}

}
