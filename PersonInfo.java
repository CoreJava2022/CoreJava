

class PersonInfo{
  String name;
  String lastName;
  
  
     public  PersonInfo(String name,String lastName){
	  this.name=name;
	  this.lastName=lastName;
	  System.out.println("whole name of person is :"+name+" "+lastName);
  }
  
  public static void main(String[] args){
	 
	  PersonInfo personInfo = new PersonInfo("manasi","kulkarni");
	 
  }
}