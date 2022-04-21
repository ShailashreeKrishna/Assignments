package com.exercise;

import java.util.Arrays;
import java.util.List;

public class StringOperation {
	
	private String[] list;
	

	public StringOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public StringOperation(String[] list) {
		super();
		this.list = list;
	}
	

	public String[] getList() {
		return list;
	}


	public void setList(String[] list) {
		this.list = list;
	}
	


	@Override
	public String toString() {
		return " [list=" + Arrays.toString(list) + "]";
	}


	public int positionOf(int i) {
		// TODO Auto-generated method stub
		int list1=0;
		if(list1!=0) {
		list1=this.positionOf(i);
		}
		return i;

		
	}

	public int occurenceof(int i) {
		// TODO Auto-generated method stub
		int j=0;
		String list = null;
		for(j=0;list!=null;j++) {

	j=this.occurenceof(i);
		}
		return j;
		
	}

		
	
	
	


}
