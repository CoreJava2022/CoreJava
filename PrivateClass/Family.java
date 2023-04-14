
public class Family {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.solveMyProblem("Money Issue");
	
	}

}
 class Parent{
	String problem;
	int ammount;
	 public String solveMyProblem(String problem){
		 ammount = new Wealth().getMoney(10000);
		 return problem;
	 }
private class Wealth{
	
	private int getMoney(int money) {
		System.out.println("Rs 1,00,000");
		return money;
	}
}
}
class Rooms{
	String access;
	private String parentBedRoom(String access) {
		access = "Locker access is having only with Parent";
		return access;
	}
	
	protected String guestRoom(String access) {
	
		return "Guest & family Member can access a gusetRoom";
	}
	
	public String Hall() {
		
		return "All Family members, guest & visitor can sit in Hall";
	}
}