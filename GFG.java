/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int n=s.nextInt();
		    int arr[]=new int[n];
			for(int o=0;o<n;o++){
				arr[o]=s.nextInt();
			}
		    sort(arr,n);
				
			for(int k=0;k<n;k++){
		      System.out.print(arr[k]);
		    }
		    System.out.println();		
	    }
		
	    
	}
	
       public static void sort(int arr[],int n){
	   int temp;
	   for(int i=0;i<n;i++){
	       for(int j=1;j<n;j++){
	           if(arr[j]<=arr[j-1]){
	               temp=arr[j];
	               arr[j]=arr[j-1];
	               arr[j-1]=temp;
	           }
	       }
	   }
	   
	}
}