import java.util.*;
class Binarys
{
public static void main(String []args)
	{
		int n,m,i,e;
		Scanner s=new Scanner(System.in);
			System.out.println("enter the total number of elements in an array");
			n=s.nextInt();
			int a[]=new int[n];
			System.out.println("enter the elements of an array");
		for(int u=0;u<a.length;u++)
			{
			a[u]=s.nextInt();	
			}
			i=0;
			e=a.length;
			m=(i+e)/2;
			System.out.println("enter the searching element");
			int se=s.nextInt();
			while(i<=e&&a[m]!=se)
			{	if(se>a[m])
				{
					i=m+1;
					m=(i+e)/2;
				}
				else
				{
					e=m-1;
					m=(e+i)/2;
				}
			}
				if(se==a[m])
				{
					System.out.println("at index ="+m);
				}
				
				
	}			
}