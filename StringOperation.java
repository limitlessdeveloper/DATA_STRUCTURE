import java.util.*;
import java.lang.*;
class StringOperation{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.println("lexicographically comparision :"+s1.compareTo(s2));
		System.out.println("lexicographically comparision ignore case"+s1.compareToIgnoreCase(s2));
		System.out.println("Compare the contents "+s1.equals(s2));
		System.out.println("concantation "+s1.concat(s2));
		System.out.println("upper case "+s1.toUpperCase());
		System.out.println("lower case "+s1.toLowerCase());
		System.out.println(s1.substring(0,3));
		System.out.println(s1.substring(3));
		System.out.println(s1.trim()+" "+s2);
		
	} 
}