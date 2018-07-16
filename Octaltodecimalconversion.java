import java.io.*;
import java.util.*;
import java.lang.Math.*;
 class TestClass {
	 public static void main(String[] args) { 
	Scanner s=new Scanner(System.in);		
		int a=s.nextInt();
 			int num=0,i=0;
       while(a!=0){
       		int c=a%10;
         	num= (int)(num + c*(Math.pow(8,i)));
         a=a/10;
         i++;
       }
	   System.out.println(num);
     }
}