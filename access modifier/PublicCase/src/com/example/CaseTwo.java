package com.example;
 class Two{
	//public DataMember
	public int id=101;
	public String name="Rutuja";
	
	//public constructor
	public Two() {
		System.out.println("Constructor calling from super class");
	}
		
	//public method
	public void show() {
		System.out.println("Employee id is :"+id);
		System.out.println("Employee Name is :"+name);
	}		
}
public class CaseTwo extends Two{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseTwo caseTwo=new CaseTwo();
		caseTwo.show();
	}
}
