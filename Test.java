import java.util.Scanner;
class Test{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			
			for(char a='A';a<'Z';a++){
				if(i==a-'A'+1)
				System.out.println(i+" "+a);
			}
			
		}
		
	}
}