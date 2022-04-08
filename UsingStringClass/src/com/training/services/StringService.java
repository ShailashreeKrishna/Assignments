package com.training.services;

public class StringService {
	public void stringEquals(String str1,String str2)
	{
		System.out.println("Is Values Same:"+str1.equals(str2));
		//System.out.println("Are they Pointing to Same Location:"+(str1==str2));//it is also a crt one 
		System.out.println(str1==str2);//another method it is also crt one
	}
public void stringObjectEquals() {
	
	String ram=new String("Ram");
	String ramesh=new String("Ram");
	
	System.out.println("Is Values Same:"+ram.equals(ramesh));
	System.out.println(ram==ramesh);
	
}
//public void usingTrim(String name)
//{
//	System.out.println("Without Trim:"+name);
//	System.out.println("Left Trim:"+name.trim());
//	
//	}
public String usingTrim(String name)
{
	System.out.println("Without Trim:"+name);
	System.out.println("Left Trim:"+name.trim());
	return name.trim();
	}
public void lengthOfString(String name)
{
	//String resp=usingTrim(name);
	//System.out.println("String length:"+name.length());
	System.out.println("String length:"+name.trim().length());
	}
public void usingSubString(String name) {
	System.out.println(name.substring(12));
	System.out.println(name.substring(11,18));
}
public void usingCharAtAndIndexOf(String name) {
	System.out.println("Index position of @:"+name.indexOf('@'));
	System.out.println("Index position of 3:"+name.charAt(3));
	
}
public void usingReplace(String str1,String str2) {
	System.out.println(str1.replace(".com", ".org"));
	System.out.println(str2.replace("welcome", "tamilnadu"));
	System.out.println(str2.replace('b', 'B'));//replace single word
}
public void usingConcate(String str1,String str2) {
	//String is immutable cannot change
	System.out.println(str1.concat(str2));
	//for append
	//String builder is mutable
	//append means adding at end
	StringBuilder builder = new StringBuilder(str1);//another method to join
	builder.append(str2);
	System.out.println(builder.toString());
}
public void usingCompareTo(String str1,String str2) {
	System.out.println(str1.compareTo(str2));
}
public void usingStringFormat(String str1,double mark) {
	String frmtString = String.format("%s", str1);
	System.out.println(frmtString);
	
	System.out.println(String.format("Mark %.2f", mark));

}
public void usingStringFormat(int mark) {
	System.out.println(String.format("octal %o", mark));
	
	System.out.println(String.format("hexa %x", mark));
}
public void usingStringFormat(int mark1,int mark2) {
	System.out.println(String.format("octal %1$o, hexa %2$x", mark1,mark2));
	
	
}
public void usingStringFormat(String str1,String str2) {
	System.out.println(String.format("  %1$s,%2$S",str1,str2));
	
	
}
public void usingStringFormat(long value) {
	System.out.println(String.format("%+d", value));
}

}