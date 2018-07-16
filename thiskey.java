import java.util.*;
class thiskey
{
	public static void main(String args[])
	{
		rel a=new rel(10);
		a.call();
		
	}
}
class rel
{
	int a;
	rel(int a)
	{
		this.a=a;
	}
	void call()
	{
		this.show();
	}
	void show()
	{
		System.out.println(a);
	}
}