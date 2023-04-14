class mother{
	
	public String solveMyFamilyProblem(){
		
		MyFamilyProblem myFamilyProblem = new MyFamilyProblem();
		myFamilyProblem.getMoney(23400);
		
	}
	
	private class MyFamilyProblem{
		
		public int getMoney(int money){
			System.out.println("getMoney called ::"+ money);
			return money;
		}
		
	}
	
	
	
}