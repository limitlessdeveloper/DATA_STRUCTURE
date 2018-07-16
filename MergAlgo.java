import java.util.*;
import java.lang.*;
class MergAlgo
{
	public static void main(String []args)
	{
		int n;
		System.out.println("Enter the number of Elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int i=0,j=n-1;
		mergsort(a,i,j);
		for(int u=0;u<=j;u++)
		{
			System.out.print(a[u]+" ");
		}
	}
	public static void mergsort(int ar[],int i ,int j)
	{ 	
		while(i<j)
		{
		int mid=(i+j)/2;
		int l[]=new int[mid];
		int r[]=new int[j-mid];
		for(int t=0;t<=mid;t++)
		{
			l[t]=ar[t];
		}
		for(int y=mid+1;y<=j;y++)
		{
			r[y]=ar[y];
		}
		mergsort(l,i,mid);
		mergsort(r,mid+1,j);
		merg(l,r,ar);
		}
	}
	public static void merg(int L[],int R[],int A[])
	{
		int il=L.length;
		int rl=R.length;
		int i=0,j=0,k=0;
		while(i<=il-1 && j<=rl-1)
		{
			if(L[i]<=R[j])
			{
				A[k]=L[i];
				i++;
				k++;
			}
			else 
			{
				A[k]=R[j];
				j++;
				k++;
			}
			
		}
		if(i>il-1)
		{
		while(j<=rl-1)
		{
			A[k]=R[j];
			j++;
			k++;
		}
		}
		if(j>il-1)
		{
		while(i<=rl-1)
		{
			
			A[k]=L[i];
			i++;
			k++;
		}
		}
	}
}