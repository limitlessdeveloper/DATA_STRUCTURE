import java.util.*;
import java.lang.*;
class generics<T1,T2>
{
private	T1 t1;
private	T2 t2;
	void set(T1 t1,T2 t2)
	{
		this.t1=t1;
		this.t2=t2;		
	}
	T1 get1()
	{
		return t1;
	}
	T2 get2()
	{
		return t2;
	}
}
class generics02
{
	public static void main(String []args)
	{
//		generics obj=new generics();
		generics<Integer,String> obj1=new generics<1331,"sadaff">();
	//	generics<Integer,Integer> obj2=new generics<>();
	//	obj1.set(123,1456);
		System.out.println(obj1.get1()+" "+obj1.get2());
	}
}