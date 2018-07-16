import java.util.*;
import java.lang.Math.*;
import java.io.*;
class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       int num1=0,i=0;
       int num2=0;
       while(a!=0&&b!=0){
       	num1+=(a%10)*(Math.pow(2,i));
         num2+=(b%10)*(Math.pow(2,i));
         i++;
         a/=10;
         b/=10;
       }
	   //System.out.println(num1+" "+num2);
       int num=0;
       num1+=num2;
       while(num1!=0){
       	num=num*10 +(num1%2);
         num1/=2;
       }
	   num1=0;
	   while(num!=0){
		   num1=num1*10 +(num%10);
		   num/=10;
		   
	   }
       
       System.out.println(num1);
	}
}