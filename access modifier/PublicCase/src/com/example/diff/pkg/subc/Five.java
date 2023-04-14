package com.example.diff.pkg.subc;

public class Five {
	//public DataMember
	public int id=101;
	public String name="Rutuja";
				
	//public constructor
	public Five() {
		System.out.println("Constructor calling from super class");
	}
			
	//public method
	public void show() {
		System.out.println("Employee id is :"+id);
		System.out.println("Employee Name is :"+name);
	}
}
