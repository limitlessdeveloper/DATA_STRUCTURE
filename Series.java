import java.util.*;
class Series
{
	public static void main(String []args) 
	{
		int n;
		System.out.println("Enter the array ");
		Scanner s=new Scanner(System.in);
		// n=s.nextInt();
		int a[]=new int[10];
		
		for (int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		int r = max(a);
	System.out.println("the index value is = "+r);
	}
	static int max(int x[])
	{
	int h=0,u=x[0];
		for(int i=1;i<x.length;i++)	
		{
			if(u<=x[i])
				{
					u=x[i];
					h=i;
				}
		}
		return h;
	}
}