//Same class
public class CaseOne {
	
	//public DataMember
	public int id=101;
	public String name="Rutuja";
		
	//public constructor
	public CaseOne() {
		System.out.println("Constructor calling from super class");
	}
	
	//public method
	public void show() {
		System.out.println("Employee id is :"+id);
		System.out.println("Employee Name is :"+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseOne caseOne= new CaseOne();
		caseOne.show();
	}

}
