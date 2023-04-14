//same class 
public class CaseOne {
	
	//protected DataMember
	protected int id=101;
	protected String name="Rutuja";
	
	//protected method
	protected void show() {
		System.out.println("Employee id is :"+id);
		System.out.println("Employee Name is :"+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseOne caseOne=new CaseOne();
		caseOne.show();
	}

}
