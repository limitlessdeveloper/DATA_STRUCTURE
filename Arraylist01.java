import java.util.*;
import java.lang.*;
class Arraylist01
{
	public static void main(String []args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(15);
		al.add(15);
		al.add(15);
		al.add(15);
		al.add(15);
		al.add(15);
		al.remove(0);
		al.add(16);
		al.remove(1);
		for(Integer v:al)
		{
			System.out.println(v);
		}
		String S;
		Iterator e=al.iterator();
		while(e.hasNext())
		{
			S=(String)e.next();
			System.out.println(S);
		}
	}
}
