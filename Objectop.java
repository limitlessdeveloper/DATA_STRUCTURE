import java.util.*;
import java.lang.*;
class chrome
{
	int a;
	int b;
	chrome (int x,int y)
	{
		a=x;
		b=y;
	}
	//chrome calculate(chrome obj)
	void calculate(chrome obj)
	{
		obj.a=a*a;
		obj.b=b*b;
	//return obj;
	}
}
public class Objectop
{
	public static void main(String []args)
	{
		chrome obj=new chrome(10,20);
		System.out.println("A= "+obj.a+" "+"B= "+obj.b);
		obj.calculate(obj);
		//System.out.println("object as a parameter \nA= "+obj1.a+" "+"B= "+obj1.b);
		System.out.println("object as a parameter \nA= "+obj.a+" "+"B= "+obj.b);
	}
}