import java.util.*;
import java.lang.*;
interface generics<R,I>
{
	public R getR();
	public I getI();
} 
class GenericsClass<R,I> implements generics<R,I>
{
private	R real;

private	I imagnary;
	GenericsClass(R real,I imagnary)
	{
		this.real=real;
		this.imagnary=imagnary;
	}
	public R getR(){return real;}
	public I getI(){return imagnary;}
}
public class generics03
{
	public static void main(String []args)
	{
		GenericsClass<Integer,Float> obj=new GenericsClass<Integer,Float>(12345,525.252f);
		System.out.println(obj.getI()+" "+obj.getR());
	}
}
