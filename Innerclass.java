
import java.util.*;
public class Sample
{
	public static void main(String [] args)
	{	
	//System.out.println("text");	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no. of elements");
	int	a=s.nextInt();
	outer o=new outer(a);
	//o.read();
	
	}
}
class outer 
{
	int r;
	outer(int r)
	{
		this.r=r;
	int []a=new int[r];
		//inner obj=new inner();
	// }
	// void read()
	// {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		inner obj=new inner(a);
		//obj.Sum();
		
	} 

	class inner
	{
				int sum;
			inner(int a[])
			{
				for(int t=0;t<a.length;t++)
				{
					sum=sum+a[t];
				}
				System.out.println("Array Sum = "+sum);
			}
	}
}