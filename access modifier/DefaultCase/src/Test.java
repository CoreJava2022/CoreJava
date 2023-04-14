//Case 1 :- default class,DM and Method in SameClass
 class Test {
	
	String mobileNo; //Default Data Member
	
	//Getter and Setter Method of Default Data Member 
	 String getMobileNo() {
		return mobileNo;
	}
	 void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	 //default method
	 int add(int a, int b){
		 int c=a+b;
		 return c;
	 }
	 
	 //default constructor
	 Test(){
		 mobileNo="9730515607";
		 System.out.println("Mobile No is "+mobileNo);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		
		//calling default Data Member in Default class
		test.setMobileNo("888888888");
		System.out.println("Mobile No calling From method's  "+test.getMobileNo());
		
		//calling default method in Default class
		int c= test.add(10, 20);
		System.out.println("The addition is "+c);
	}

}
