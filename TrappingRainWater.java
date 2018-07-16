/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=s.nextInt();
		    int left[]=new int[n];
		    int right[]=new int[n];
		    left[0]=arr[0];
		    for(int i=1;i<n;i++)
		        left[i]=Math.max(arr[i],left[i-1]);
		    right[n-1]=arr[n-1];
		    for(int i=n-2;i>=0;i--)
		        right[i]=Math.max(arr[i],right[i+1]);
		    int water=0;
		    for(int i=0;i<n;i++)
		        water+=Math.min(left[i],right[i])-arr[i];
		    System.out.println(water);
		}
	}
}