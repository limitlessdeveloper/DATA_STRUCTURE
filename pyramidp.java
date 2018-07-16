import java.util.*;
class pyramidp
{
	public static void main(String []args)
	{
		System.out.println("enter the no of line");
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
				
			for(int j=i+2;j<=n;j++)
			{
				System.out.print(" ");			
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}	
					
		System.out.println();	
		}
	for(int i=0;i<n-1;i++)
				{
					for(int k=0;k<=i;k++)
					{
						System.out.print(" ");
					}
				for(int j=n;j>i+1;j--)	
					{
						System.out.print("* ");
					}
						System.out.println();					
				
				 }

	}
}
