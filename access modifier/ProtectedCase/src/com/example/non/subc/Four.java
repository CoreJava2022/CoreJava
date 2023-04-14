package com.example.non.subc;

public class Four {
	//protected DataMember
			protected int id=101;
			protected String name="Rutuja";
				
		//protected constructor
			protected Four(String firstName, String lastName) {
				System.out.println("My FIRST Name is:: "+firstName+" and LAST Name is:: "+lastName);
			}
			
		//protected method
			protected void show() {
				System.out.println("Employee id is :"+id);
				System.out.println("Employee Name is :"+name);
			}
}
