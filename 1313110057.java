import java.util.*;
import java.io.*;
class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       for(int i=1;i<=a;i++){
       	for(int j=1;j<=i;j++){
        	System.out.print(j+" ");
        }
         for(int j=i-1;j>0;j--){
         	System.out.print(j+" ");
         }
         System.out.println();
       }
	}
}