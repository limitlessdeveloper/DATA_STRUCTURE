import java.util.*;

class Sample{
	public static void main(String []args){
		int flag1=0,flag2=0;
		int a,b;
		System.out.println("enter the value of the integer");
		System.out.println("first integer value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("second Integer value");
		b=s.nextInt();
		
		int a1=a+b;
		while(a1!=0){
			a1=a1/10;
			flag1++;
		}
		a1=b;
		while(a1!=0){
			a1=a1/10;
			flag2++;
		}
		
		if(flag1==flag2) System.out.println("sum have the same digits");
		else System.out.println("sum have the different digits");
		
	}
}