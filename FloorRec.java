import java.util.*;
import java.lang.*;
class FloorRec
{
	public static void main(String  []args)
	{
		System.out.println("enter the no. of elements");
		int n;
	    Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int t=0;t<n;t++)
		{
			a[t]=s.nextInt();
		}               
		int i=0,j=a.length-1;
		System.out.println("enter the next search element");
		int se=s.nextInt();
		int r=fun(a,i,j,se);
		if(r==-1)System.out.println("there is no element smaller then the given element") ;
		else System.out.println(r);
	} 
	public static int fun(int a[],int i,int j,int s)
	{			
	if(i>j) return -1 ;
	if(s>a[j]) return a[j];
	int mid=(i+j)/2;
	//System.out.println(mid);
    if(s<a[mid]&&s>a[mid-1])return a[mid-1];
	if(s<a[mid])return fun(a,i,mid-1,s);
	else return fun(a,mid+1,j,s);
	}
} 