import java.util.*;
import java.lang.*;
class Mergar
{
	public static void main(String [] args)
	{
		int a1[]={1,2,3,4,5,9};
		int i=0;
		int il=a1.length;
		int a2[]={8,123,43,44,85,96};
		int j=0,jl=a2.length;
		int a3[]=new int[il+jl];
		int k=0;
		System.out.println(jl);
		
		while(i<=il-1&&j<=jl-1)
		{	
			if(a1[i]<=a2[j])
			{
				a3[k]=a1[i];
				i++;
				k++;
			}
			else 
			{
				a3[k]=a2[j];
				j++;
				k++;
			}
		}
		System.out.println(i);
		System.out.println(il);
		
		 System.out.println(j);
		 System.out.println(k);
		 if(i>il-1)
		{
			while(j<=jl-1)
			{
			a3[k]=a2[j];
			j++;
			k++;
			}
		}
		 //System.out.println(k);
	 if(j>jl-1)
		{
				while(i<=il-1)
			{
			a3[k]=a1[i];
			i++;
			k++;
			}
		}		
		 System.out.println(k);
		// int n;
		// System.out.println(i);
		// System.out.println(j);
		// n=i+j;
		// System.out.println(n);
			System.out.println("Sorted array");
		for(int t=0;t<k;t++)
		{
			System.out.print(a3[t]+" ");
			
		}
	}
}