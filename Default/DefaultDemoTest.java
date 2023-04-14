
package Default;

import defaults.DefaultDemo;

public class DefaultDemoTest{
	
	public static void main(String args[]){
		
		DefaultDemo defaultDemo = new DefaultDemo();
		
		defaultDemo.setName("Manasi");
		System.out.println("Name is :"+defaultDemo.getName());
		
		defaultDemo.setMobileNo("7378772065");
		System.out.println("MonileNo is :"+defaultDemo.getMobileNo());
		
		int c = defaultDemo.add(10,20);
		System.out.println("Addition is is :"+c);
	}
}