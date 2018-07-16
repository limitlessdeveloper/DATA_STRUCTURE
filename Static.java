import java.util.*;
class Static
{
	public static void main(String []args)
	{
			var o1=new var(10,20);
			var o2=new var(40,50);
			System.out.println("O1  = "+o1.a+" "+o1.b);
			System.out.println("O2  = "+o2.a+" "+o2	.b);           //when use this it creates only one memory block of each member variable for multiple object.
																//without using of this it will create saparate memory block for saparate object.			
	}
}
class var
{
	static int a;
	static int b;
		var(int x,int y)
		{
		a=x;
		b=y;		
		}
}