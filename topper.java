import java.util.*;
import java.lang.*;
class Stdcomp
{
String name;
long roll_no;
float gpa;
Stdcomp(String s,long l,float f)
{
	name=s;
	roll_no=l;
	gpa=f;
}
Stdcomp comp(Stdcomp obj,Stdcomp obj1)
{
	if(obj.gpa>obj1.gpa)
	{
		return obj;
	}
	else
	{
		return obj1;
	}
}
} 
public class topper
{ 	
	public static void main(String []args)throws Exception
	{
		String s1,s2;
		long r1,r2;
		float g1,g2;
		System.out.println("enter the name,roll_no and grade");
		Scanner s=new Scanner(System.in);
		System.out.println("enter details of student 1");
		System.out.println("S1.Name = ");
		s1=s.nextLine();
		
		System.out.println("\nS1.roll_no = ");
		r1=s.nextLong();
		
		System.out.println("\nS1. grade = ");
		g1=s.nextFloat();
		
		System.out.println("\nS2.Name = ");
		s2=s.next();
		
		System.out.println("\nS2.roll_no = ");
		r2=s.nextLong();
		
		System.out.println("\nS2. grade = ");
		g2=s.nextFloat();
		
		Stdcomp obj=new Stdcomp(s1,r1,g1);
		Stdcomp obj1=new Stdcomp(s2,r2,g2);
		
		Stdcomp obj2=obj.comp(obj,obj1);
		System.out.println("Topper \n name = "+obj2.name+"\nroll_no = "+obj2.roll_no+"\ngpa = "+obj2.gpa);
	}
}