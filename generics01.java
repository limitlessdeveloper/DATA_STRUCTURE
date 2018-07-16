import java.util.*;
import java.lang.*;
class generics
{
	Object object;
	void set(Object object)
	{
		this.object=object ;
	}
	Object  get()
	{
		return(object);
	}
} 

class generics01
{
	public static void main(String []args)
	{
			generics obj=new generics();
			obj.set(obj);
			System.out.println(obj.get());
	}
}	
