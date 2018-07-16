import java.util.*;
import java.lang.*;
class NumLength
{
	public static void main(String []args)
	{
		int n;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int j=n,i,k=0,sum=0;
		do{
			i=j%10;
			sum+=i;
			k+=1;
			j=j/10;
			
		}while(j>0);
	System.out.println("the number of digit = "+k+"\nthe sum of digits is = "+sum);
	}
}
