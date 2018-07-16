import java.util.*;
public class palindrom
	{
	public static void main(String []args)
		{
		String r,o="";
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter the element to check");
		r=s.nextLine(); 
		
//		char a[]=new char[];
		for(int i=r.length()-1;i>=0;i--)
			{
				o=o+r.charAt(i);
			}	
		if(o.equals(r)==true)
			{
				System.out.println("palindrom");
			}
		else 
			{
				System.out.println("not palindrom");
			}	
		}
	}