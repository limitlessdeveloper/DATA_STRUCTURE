import java.util.*;
import java.io.*;
class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int arr[]=new int[a];
	   for(int i=0;i<a;i++){
		   arr[i]=s.nextInt();
	   }
	   int h=s.nextInt();
       for(int i=0;i<a;i++){
       		int b=arr[i];
         for(int j=i+1;j<a;j++){
         	int c=arr[j];
           if((b+c)==h){
           	System.out.println(b+"+"+c+"="+h);
           }
         }
       }
	}
}