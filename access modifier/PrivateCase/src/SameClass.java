//same Class
 class SameClass {
	 
	 //private Data Member 
	 private int id=101;
	 
	//private Constructor 
	 private SameClass(){
		 System.out.println("ID calling from private constructor calling "+id);
	 }
	 
	//private Method  
	 private void add(){
		 System.out.println("private method calling ");
	 } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SameClass sameClass=new SameClass();//private Constructor calling 
		sameClass.add();// private method calling 
	}
}
