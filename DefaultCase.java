class DefaultCase{
int a;
int b;

      DefaultCase(int a,int b){
        this.a=a;
		this.b=b;
		System.out.println("values are "+a+" "+b);
       }

public static void main(String[] args){
    DefaultCase defaultCase = new DefaultCase(10,20);    
}
}