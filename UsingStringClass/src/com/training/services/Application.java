package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringService service=new StringService();
		String city="Bangalore";
		System.out.println(String.format("%S", city));
		System.out.println(String.format("%1$.2f %2$.2f  %3$.2f",100.456,200.4567,300.5678));
       int key=14;
      switch (key) {
	case 1:
		
		service.stringEquals("ram", "ram");break;
		
	case 2:
		service.stringObjectEquals();break;
	case 3:
		service.usingTrim("  ramesh  ");break;
		
	case 4:
		service.lengthOfString("  ramesh  ");break;
	case 5:
		service.usingSubString("ShailashreeKrishna");break;
	case 6:
		service.usingCharAtAndIndexOf("ram@abc.com");break;
	case 7:
		service.usingReplace("ram@134.com", "welcome to bangalore");break;
	case 8:
		service.usingConcate("shailashree", "Krishna");break;
	case 9:
		service.usingCompareTo("shree", "krishna");break;
	case 10:
		service.usingStringFormat("shree", 98.6990);break;
	case 11:
		service.usingStringFormat(45);break;
	case 12:
		service.usingStringFormat(56, 95);break;
	case 13:
		service.usingStringFormat("tamilnadu", "Bangalore");
		break;
	case 14:
		service.usingStringFormat(-420L);break;
		
	default:
		break;
	} 
	}

}
