import java.util.*;
public class Factorial 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double e=0;
		int n;
		System.out.println("enter the nth value of series");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{	
			e=e+(1/fact(i));
		}
		System.out.println(e);
	}
 static double fact(int x)
 {
	int fr=1;
	 if(x==0){
		 return 1;}
	 
	 else
	 {
		 for(int f=1;f<=x;f++)
		 {
			 fr=fr*f;	
		 }
		 return fr;
	 }	
 }
}
