class Mother{
	
  public void solveProblem(){
	  MyFamily.greeting();
	  MyFamily.myFamilyProblem("family Issue");
       System.out.println("problem solved");
  }
 private static class MyFamily{
	
	public static void myFamilyProblem(String problem){
		
		 System.out.println("problem is "+problem);
	}
	//Here we can give static method only 
	
}
}
class Father{
	
	public static void main(String[] args){
		Mother mother = new Mother();
		mother.solveProblem();
		
	}
}