import java.util.*;
import java.lang.*;
class StringVsStringBufferOperation{
	public static void main(String args[]){
		String s1="abc";
		String s2=s1;
		s1+="d";
		System.out.println("s1="+s1+" s2="+s2+" "+(s1==s2));      //abc abcd false......because String are immutable so it won't change its orignal value implictly
		StringBuffer s=new StringBuffer("abc");
		StringBuffer n=s;
		s.append("d");
		s.insert(0,"r");	
		System.out.println("s1="+s+" s2="+n+" "+(s==n));			//abcd abcd true as String Buffer are mutable so it will changed with the change in the instance of the orignal String buffer.
	}
}
