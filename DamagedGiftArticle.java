import java.util.*;
import java.lang.*;

class Sample{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		
		System.out.println("By Methods");
		if(Character.isUpperCase(a)) System.out.println("upper case");
		else if(Character.isLowerCase(a)) System.out.println("lower case");
		else if((int)a<=57 && (int)a>=48){
			System.out.println("digit");
		}
		else{
			System.out.println("damaged");
		}
		System.out.println(	"By Implementation");
		if((int)a>=65 && (int)a<=90) System.out.println("upper case");
		else if((int)a>=97 && (int)a<=122) System.out.println("lower case");
		else if((int)a>=48 && (int)a<=57) System.out.println("digit");
		else System.out.println("damaged");
	}
	
}