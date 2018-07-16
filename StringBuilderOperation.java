import java.util.*;
import java.lang.StringBuilder;
class StringBuilderOperation{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		StringBuilder s1=new StringBuilder(a);
		StringBuilder s2=new StringBuilder(b);
		System.out.println(s1.delete(0,3));
		System.out.println(s1.deleteCharAt(4));
		System.out.println(s1.reverse());
		System.out.println(s1.indexOf("h"));     //returns the first letter index 
		s1.setCharAt(4,'z');
		System.out.println(s1);
		System.out.println();
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(4));
		System.out.println(s1.charAt(4));
		System.out.println(s1.length());
		System.out.println(s1);
		s1.insert(0,'A');
		System.out.println(s1);	
	}
}