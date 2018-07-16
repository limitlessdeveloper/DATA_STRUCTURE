import java.io.*;
import java.util.*;
class Sample{
	public int adajcentElementsDifference(int arr[],int n){
    	int a=arr[0],b=arr[1];
      int diff=arr[1]-arr[0];
      for(int i=1;i<n;i++){
        	if(arr[i-1]-arr[i]>diff ){
            	diff=arr[i-1]-arr[i];
              //	a=arr[i-1];
              //b=arr[i];
            }
        }
      return(diff);
    }
}
 class TestClass {
	 public static void main(String[] args) { 
		Sample ob=new Sample();
       Scanner s=new Scanner(System.in);
       int length=s.nextInt();
       int inputArray[]=new int[length];
       for(int i=0;i<length;i++){
       	inputArray[i]=s.nextInt();
       }
       int f=ob.adajcentElementsDifference(inputArray,length);
		System.out.println(f);
     }
}