import java.util.*;
import java.lang.*;
class Prime
{
	public static void main(String []args)
	{
		int u=0,n,i;
		System.out.print("enter the Nth to get all prime number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	//	for(int i=2;i<=n;i++)
	i=2;	
	do
		{
			int j=0,k=2;
			//for(int k=2;k<=i;k++)
			do{
			if(i%k==0)
			{
				j+=1;
			}	
			k++;
			}while(k<=i);			
			if(j==1)
			{
				System.out.print(i+" ");
				u+=1;
			}
			i++;
		}while(i<=n);
	System.out.println("\nthe total no of prinme numbers are=\t"+u);
	}
}	
