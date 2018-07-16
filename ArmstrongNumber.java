import java.util.*;
import java.lang.*;
import java.math.*;

class ArmstrongNumber
{
	public static void main(String []args)
	{
		int n;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int j=n,i,k=0;
		
		do{
			i=j%10;
		//	sum=sum+i;
			k+=1;
			j=j/10;
			
		}while(j>0);
		int h=n;
System.out.println("the number of digit = "+k);
int sum1=0;
		do{
			i=h%10;
		sum1=sum1+pow(i,k); 
			
			h=h/10;
			
		}while(h>0);
		System.out.println(sum1);
	if(sum1==n)
	{System.out.println("this is an ArmstrongNumber");}
	if(sum1!=n)
	{System.out.println("this is not an ArmstrongNumber");}
 
	}
public static int pow(int a,int b)
	{	int t=1;
		for(int i=1;i<=b;i++)
		{
			t*=a;
		}
		return t;
	}
}