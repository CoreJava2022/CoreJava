package defaults;
// default class
public class DefaultDemo{    // creating public class
	private String name;
	String mobileNo;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setMobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}
	public String getMobileNo(){
		return mobileNo;
	}
	
	public int add(int a,int b){    // taking method public
		return a+b;
	}
	public DefaultDemo(){      //  taking constructor public
		mobileNo="7387553076";
		System.out.println("Mobile no :"+mobileNo);
	}
}