//same package with subclass 
package com.example;
class Two{
	//protected DataMember
		protected int id=101;
		protected String name="Rutuja";
		
		//protected method
		protected void show() {
			System.out.println("Employee id is :"+id);
			System.out.println("Employee Name is :"+name);
		}
}
public class CaseTwo extends Two {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two two=new Two();
		two.show();
	}

}
