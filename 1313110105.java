import java.util.*;
import java.io.*;
 class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int i=0,num=0;
       while(num<=a){
       	if(num==a){ System.out.println("Yes"); return;
		}
		num=i*(i+1);
         i++;
       }
       System.out.println("No");
	}
}