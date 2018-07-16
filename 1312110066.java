import java.util.*;
import java.io.*;
 class TestClass {
	 public static void main(String[] args) { 
	Scanner s=new Scanner(System.in);
       int a=s.nextInt();
	   int i=0;
       int num[]=new int[6];
       while(a!=0){
       	num[i]=(a%10);
         a=a/10;
		 i++;
       }
	   --i;
       while(i>-1){
       	System.out.print(num[i]+" ");
         i--;
       }
	}
}