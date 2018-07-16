import java.util.*;
class Stackk
{
	int top;
	int a[]=new int[3];
	Stackk(int top_i)
	{
		top=top_i;
	}
	void push(int ele)
	{
		if(top<3)
		{
		    System.out.println("pushed element : "+ele);
			a[top++]=ele;
		}
		else throw new ArrayIndexOutOfBoundsException();
	}
	void pop()
	{
		if(top>0)
		System.out.println("popped element : "+a[--top]);
		else throw new NoSuchElementException();
	}
}
class ExceptionHandling
{
	public static void main(String []args)
	{
		Stackk o=new Stackk(0);
		try{
		o.push(1);
		o.push(2);
		o.push(3);
		o.push(4);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("overflow condition arrives : "+e);
		}
		try{
			for(int i=0;i<4;i++)o.pop();
		}catch(NoSuchElementException s)
		{
			System.out.println("Underflow condition arrives : "+ s);
		}
	}
	
}