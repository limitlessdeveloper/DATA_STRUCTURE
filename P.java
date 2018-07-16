
import java.util.*;
import java.lang.*;
 class P {

	public static void main(String []args)
	{
		System.out.println("enter the number of line");
			
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(n);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
}



   // *
  // * *
 // * * *
// * * * *
