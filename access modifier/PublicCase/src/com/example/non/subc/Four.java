package com.example.non.subc;

public class Four {
	//public DataMember
	public int id=101;
	public String name="Rutuja";
			
	//public constructor
	public Four() {
		System.out.println("Constructor calling from super class");
	}
		
	//public method
	public void show() {
		System.out.println("Employee id is :"+id);
		System.out.println("Employee Name is :"+name);
	}	
}
