import java.util.*;
import java.lang.*;
class twogen<t,v>
{
	t ob1;
	v ob2;

	twogen(t o1, v o2)
	{
		ob1=o1;
		ob2=o2;
	}

	// void showTypes()
	// {
		// System.out.println("book name :"+);	
		// System.out.println("");
	// }
	t getob1()
	{
		return ob1;
	}
	v getob2()
	{
		return ob2;
	}
}


class simpgen
{
	public static void main(String args[])
	{
		twogen<String,Integer> tgObj=new twogen<String,Integer>("java core",21);
		twogen<String,Float> tgObj1=new twogen<String,Float>("java core",535.2F);
		System.out.println("Book Name:" +tgObj.getob1()+"\n No of pieces :"+tgObj.getob2());
		System.out.println("Book Name:" +tgObj1.getob1()+"\n Book price :"+tgObj1.getob2());
	}
}
