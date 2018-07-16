import java.util.*;
import java.lang.*;
import java.math.*;
 class A
{
	int a;
	A (int x)
	{
	a=x;
	}
	A cal()//A obj)
	{	
		A objx=new A(a*a);
		//A obj1=obj.cal(a)
		return objx;
	}
}
public class objop
{
	public static void main(String []args)
	{
		A obj1=new A(10);
		System.out.println("from obj1 A = "+obj1.a);
		obj1=obj1.cal();
		System.out.println("from obj1 A = "+ obj1.a);
		A obj2=obj1.cal();
		System.out.println("from obj2 A = "+obj2.a);
		obj2=obj2.cal();
		//A obj3=obj2.cal(obj2);
		System.out.println("from obj2-II A = "+obj2.a);
	}
}