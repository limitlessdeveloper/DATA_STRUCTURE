import java.util.*;
class superclass
{
	int a;
	int b;
	float c;
	superclass(int a,int b,float c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show()
	{
		System.out.println("from super\"dsa\" class "+a+" "+b+" "+c);
	}
	
}
class derived extends superclass
{
	int aa;
	int bb;
	derived(int aa,int bb,int u,int r,float h)
	{
		super(u,r,h);
		this.aa=aa;
		this.bb=bb;
	}
	void display()
	{
		System.out.println("from derived class "+aa+" "+bb);
	}
}
class superkeyword
{
	public static void main(String args[])
	{
		derived d=new derived(10,20,30,40,50.66f);
		d.display();
		d.show();
	}
}