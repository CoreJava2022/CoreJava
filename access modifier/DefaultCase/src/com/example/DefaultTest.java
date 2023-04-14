//Case 2 :- Same Package subclass (HAS-A relation )
package com.example;

 class DefaultDemo {
	
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
 public class DefaultTest extends DefaultDemo{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
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

