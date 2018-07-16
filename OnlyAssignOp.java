import java.util.*;
class A
{
	int val(char s){
	System.out.println(s);
	return 5;
	}
	int val(short a)
	{
		System.out.println(a);
		return 10;
	}
}
class OnlyAssignOp
{
	public static void main(String []args)
	{
		A o=new A();
		System.out.println(o.val(()));
		
	}
}