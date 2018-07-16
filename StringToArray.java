import java.util.*;
class StringToArray
{
	public static void main(String []args)
	{
		String s1=new String();
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char a[]=new char[s1.length()];
		/*for(int i=0;i<s1.length();i++)
		{
			a[i]=Integer.parseInt(Character.toString(s1.charAt(i)));
		}
		for(int i=0;i<s1.length();i++)
		{
		System.out.print(a[i]);
		}*/
		
		a=s1.toCharArray();
		System.out.println(a[0]);
		String p=Arrays.toString(a);
		System.out.println(p);
	}
}


/*
String to num----Integer.parseInt(String);
num to String-----String.valueOf(num);
String to character array-- s.toCharArray();
array--to String ----Array.toString();*/