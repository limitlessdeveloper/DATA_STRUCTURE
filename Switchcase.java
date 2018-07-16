import java.util.*;
import java.lang.*;

class Example
{
	public static void main(String []args)
	{
		int n;
		do
		{
		System.out.println("1.Case 1\n2.Case 2\n3.Case 3\n4.exit");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("case 1");
				break;
			}
			case 2:
			{
				System.out.println("case 2");
				break;
			}
			case 3:
			{
				System.out.println("case 3");
				break;
			}
			//default: System.out.println("Enter right choise");
		}
		}while(n!=4);
	}
}

