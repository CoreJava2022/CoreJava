class Father{

Mother mother;
	public Father(Mother mother){
       this.mother=mother;
	}
	public Mother getMotherDetails(){
		return mother;
	 }
	 public static void main(String[] args){
		Mother  mother = new Mother();
		Father father= new Father(mother);
		mother.solveMyFamilyProblem("problem");
		System.out.println("***************************************");
		System.out.println("Get value from getter method");
		System.out.println("***************************************");
		System.out.println(father.getMotherDetails().getAmount());
		//System.out.println(father.getMotherDetails().getProblemStatement());
		//System.out.println(father.getMotherDetails().getResult());
       // System.out.println(father.getMotherDetails().getmultiplication());
}	
}