import java.util.*;
class vargs
{
	public static void main(String args[])
	{
		fun(10,20,30,25);
		fun(10.23f,30.25f,30.46f);
	}
	static void fun(float...a)
	{
		for(float x:a)
		{
		System.out.println(x);	
		}
	}
	static void fun(int...a)
	{
		for(int x:a)
		{
		System.out.println(x);	
		}
	}
}