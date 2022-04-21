package com.exercise;

public class Sorting implements Comparable<Sorting> {
	private String fruitName;

	public Sorting() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sorting(String fruitName) {
		super();
		this.fruitName = fruitName;
	}
	

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	



//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Sorting other = (Sorting) obj;
//		if (fruitName == null) {
//			if (other.fruitName != null)
//				return false;
//		} else if (!fruitName.equals(other.fruitName))
//			return false;
//		return true;
//	}

	

	@Override
	public String toString() {
		return "[" + fruitName +"]";
	}

	@Override
	public int compareTo(Sorting list) {
		// TODO Auto-generated method stub
		return this.fruitName.compareTo(list.fruitName) ;
	}
	

}
