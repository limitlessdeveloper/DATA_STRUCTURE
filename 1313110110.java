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
	   int i=0;
       while(arr[i]!=42 && i<a){
       	System.out.println(arr[i]);
         i++;
       }
	}
}