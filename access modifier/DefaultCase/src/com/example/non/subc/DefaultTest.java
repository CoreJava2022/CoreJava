//same package non-sub class
package com.example.non.subc;

public class DefaultTest {

	public static void main(String[] args) {
		DefaultDemo  defaultDemo =new DefaultDemo();
		
		//calling getter & setter value of default DM of default class
		defaultDemo.setName("Rutuja Dabhade");
		System.out.println("Name calling From Getter/Setter Method's"+defaultDemo.getName());
	
		//calling getter & setter value of default DM of default class
		defaultDemo.setMobileNo("8888888888");
		System.out.println("Mobile Number calling From Getter/Setter Method's"+defaultDemo.getMobileNo());
	
		//calling default method of default class 
		int c=defaultDemo.add(10, 20);
		System.out.println("The addition of "+c);

	}

}
