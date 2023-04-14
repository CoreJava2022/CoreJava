//same package non-sub class
package com.example.non.subc;

public class DefaultDemo {

	//Default Data Member
	String name;
	String mobileNo;
	
	//Getter and Setter Method of Default  Data Member 
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	
	//Getter and Setter Method of Default Data Member 
	 String getMobileNo() {
		return mobileNo;
	}
	 void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	 
	 //Default Method
	 int add(int a, int b) {
		 int c=a+b;
		 return c;
	 }
	 
	 //Default Constructor 
	 DefaultDemo(){
		 mobileNo="9730515607";
		 System.out.println("Mobile Number calling From Constructor "+mobileNo);
	 }
}
