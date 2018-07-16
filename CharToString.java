import java.util.*;
import java.lang.*;

class CharToString
{
	public static void main(String []args)
	{
		System.out.println("Enter tne character String");
		String st=new String();
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		int length=st.length();
		char a[]=new char[length];
		for(int i=0;i<length;i++)
		{
			a[i]=st.charAt(i);
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(a[i]);
			//sr=ad.toStringChar();
			
		}
		String sr=new String(a);
		for(int i=0;i<length;i++)
		{
			sr=sr+a[i];
		}
		//sr=a.toString();
		System.out.println();
		System.out.println("string second is = "+sr);
	}
}