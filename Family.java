
public class Family {
	public static void main(String[] args) {
		Parent Parent = new Parent();
		Parent.property();
		Rooms rooms = new Rooms();
		rooms.guestRoom();
		rooms.Hall();
		//rooms.parentBedRoom();
	}
}
class Parent{
	 // make this to Wealth
	 public void  property(){
		 Wealth.Money();
		 System.out.println("locker");
	 }
	 
 private static class Wealth{
	private static void Money() {
		System.out.println("Rs 1,00,000");
	}
}
}
class Rooms{
	
	 private String parentBedRoom(){
		System.out.println("Locker access is having only with Parent");
		return "Locker access is having only with Parent";
	}
	
	protected String guestRoom() {
		System.out.println("Guest & family Member can access a gusetRoom");
		return "Guest & family Member can access a gusetRoom";
	}
	
	public String Hall() {
		System.out.println("All Family members, guest & visitor can sit in Hall");
		return "All Family members, guest & visitor can sit in Hall";
	}
}