import java.util.*;
import java.lang.*;
class Floor
{
public static void main(String []args)
	{	System.out.println("enter the number of element");	
		Scanner s=new Scanner(System.in);
		int n,sum=0,ne=0,flag=0,in=-1,no;
		no=s.nextInt();
		System.out.println("Enter the elements in an array");
		int a[]=new int[no];
		//System.out.println("enter the element in an array");
		for(int t=0;t<no;t++)
		{
			a[t]=s.nextInt();
		}
		System.out.println("enter the element");
		n=s.nextInt();
		//int sum1=n-a[0];
		int sum1=n-a[0];
		for(int i=0;i<;i++)
		{
				sum=n-a[i];
				
					if(sum<=sum1)
				{
				if(sum>0)
					{
					ne=a[i];
					in=i;
					sum1=sum;
					}
				}
				
		}
		if(in==-1)
			System.out.println("there is no smaller element from the given element");
		else
		System.out.println("the nearest element is = "+ne+"\nAt index = "+in);
	}
}
//1st index value
//2nd if no nearest element so output = -1;
