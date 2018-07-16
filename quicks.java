import java.util.*;
public class quicks
{
	public static void main(String []args)
	{
		int n;
		System.out.println("Enter the number of elements");
		 Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		 int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		 {
			arr[i]=s.nextInt();
		 }
		 int b=0,e=n-1;
		 part(arr,b,e);
		// while(b<=pos && e=>pos)
		 //{
		 //pos=part(arr,b,e);
		// if(pos>b)part(arr,b,pos-1);
		 //if(pos<e)part(arr,pos+1,e);
		 //}
		 for(int t=0;t<n;t++)
		 {
			 System.out.print(arr[t]+" ");
		 }
	}
	static void part(int a[],int beg,int end)
	{
		int i=beg,j=end,pivot=a[(i+j)/2];
		while(i<j)
		{
			while(pivot>a[i])i++;
			while(pivot<a[j])j--;
			if(i<j)
			{
				int tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
			else
			{
				int tmp=pivot;
				pivot=a[j];
				a[j]=tmp;
				
			}
		}
		if(beg<j)part(a,beg,j-1);
		if(j<end)part(a,j+1,end);
		//return j;
	}
}