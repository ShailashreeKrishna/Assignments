package com.exercise;

public class Application {
	public static String swap(String a, int i, int j) {
		// TODO Auto-generated method stub
		
		
		char[] c=a.toCharArray();
		
		char b;
		b=c[i];
		
		c[i]=c[j];
		c[j]=b;
		
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="cat";
		int len=str.length();
		//Application permutation=new Application();
		generatePermute(str,0,len);
	}
	
		public static void generatePermute(String str,int start,int end) {
			if(start==end-1) {
				System.out.println(str);
			}else {
				for(int i=start;i<end;i++) {
					str=swap(str,start,i);
					generatePermute(str,start+1,end);
					str=swap(str,start,i);
				}
			}

		
		
		
	}

		
		}


