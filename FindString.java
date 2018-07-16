import java.util.*;
import java.lang.*;
class FindString
{
	public static void main(String []args)
	{
		String s1="asdfghjkjlqwertyuio";
		String s2="tyu";
		char a[]=new char[s2.length()];
		char w=s2.charAt(0);
		for(int i=0;i<=s1.length()-s2.length();i++)
		{
			if(w==s1.charAt(i))
			{
				for(int j=0;j<s2.length();j++)
				a[j]=s1.charAt(i+j);
				String s3=new String(a);
				if(s3.equals(s2))System.out.println("String found at index = "+i);
			}
		}
	}
} 
//with only onefor loop
//with only 2 String no another array no another String