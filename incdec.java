import java.util.*;
class incdec
{
	public static void main(String []args)
	{
		int a=10;
		int c=++a;//11
		int b=a++;//11
		System.out.println("A = "+a);//12
		System.out.println("B = "+b);//11
		System.out.println("C = "+c);//11
		System.out.println("after manipulation ");
		a=10;
		b=a++;//10
		c=++a;//12
		System.out.println("A = "+a);//12
		System.out.println("B = "+b);//10
		System.out.println("C = "+c);//12
		
	}
}
//for loop with ++i;