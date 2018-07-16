import java.util.*;
class Sample{
 public static void main(String [] args) 
    {	
		int a=12345;
		int rev=0;
		do{
			rev=rev*10 + a%10;
			a=a/10;
		}while(a!=0);
			
		System.out.println(rev);		
    }
	

}