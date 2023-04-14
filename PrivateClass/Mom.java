 class Mom{
	int amount;
	
	String problemStatement;
	
	double result;

	double mul;
	
	public int getAmount(){
		return amount;
	}
	
	public String solveMyFamilyProblem(String problem){
		
		/* MyFamilyProblem myFamilyProblem = new MyFamilyProblem();
		myFamilyProblem.getMoney(23400);
		myFamilyProblem.getProblemName("About Court");
		myFamilyProblem.add(10,20);
		myFamilyProblem.mul(4,3); */
		
		amount = new MyFamilyProblem().getMoney(100000);
	
	problemStatement = new MyFamilyProblem().getProblemName(" Money Required ");
	
	result = new MyFamilyProblem().add(20,40);
	System.out.println("Addition is:"+result );
	
	System.out.println("****");
	
	System.out.println("Problem in Mother family :: "+problem);
	
	mul = new MyFamilyProblem().multiplication(30,30);
	
	System.out.println("Multiplication :: "+mul);
		
	
		return problem;
	}
	
	private class MyFamilyProblem{
		
		public int getMoney(int money){
			System.out.println("getMoney called ::"+ money);
			return money;
		}
		
		public String getProblemName(String problemName){
			System.out.println("problem is:"+problemName);
			return problemName;
		}
		double add(double a, double b){
			double c = a + b; 
			//System.out.println("Addition is:"+c);
			return c;
		}
		private double multiplication(double a, double b) {
			double c = a * b; 
			//System.out.println("multiplication is :"+c);
			return c;
		}
		
	}
	
	
	
}