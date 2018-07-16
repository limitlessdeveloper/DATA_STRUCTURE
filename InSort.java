import java.util.*;
import java.lang.*;
class InSort
{
	public static void main(String []args)
	{
		int j,temp;
		int a[]={4,3,2,1};
		for(int i=0;i<3;i++)
		{
			
			j=i;
			while(j>-1 )
			{
				if( a[j+1]<a[j])	
				{
						 temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;
				}
				j--;
			}
		}
		System.out.println("sorted array");
		for(int t=0;t<4;t++)
		{
			System.out.println(a[t]);
		}
		
	}
}

//3421
//3241
//2341
//2314
//2134
//1234