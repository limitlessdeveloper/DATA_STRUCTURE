import java.io.*;
import java.util.*;
class Rek{
	int area(int a,int b){
    	return(a*b);
    }
}
 class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       Rek ob=new Rek();
       System.out.println("Area="+ob.area(a,b));
	}
}