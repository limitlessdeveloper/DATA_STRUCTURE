import java.util.*;
class MaxSubset
{
	public static void main(String args[])
	{
		char a[]={'a','a','a','b','b','c','c','c','c','c','c','c','c','c','b','b','b','b','b','g','g','g','g','g','g','g','g','n'};
		int t1=0,t=0,i=0;
		char y=a[0],w=a[0];
		while(i<a.length)
		{
			if(y==a[i])
			{
				t1+=1;
				if(t1>t){
					t=t1;
				w=a[i];}
			}
			else
			{
				y=a[i];
				
				t1=1;
				
			}
			i++;
		}
		System.out.println("Maximum Subset of Character : "+w);
	}
}