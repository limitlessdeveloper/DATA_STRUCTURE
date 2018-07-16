/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    int x[]=new int[a];
		    int y[]=new int[a];
		    for(int i=0;i<a;i++)
		        x[i]=s.nextInt();
		    for(int i=0;i<a;i++)
                y[i]=s.nextInt();
            
			System.out.println(function(b, c, x, y));
		}
	}
	
	public static int function(int a1, int b1, int a[],int b[]){
		if(a1==0){
			if(b1>=b.length){
				int sum=0;
				for(int i=0;i<b.length;i++){
					sum+=b[i];
				}
				return sum;
			}
			return Integer.MIN_VALUE;
		}
		if(b1==0){
			if(a1>=a.length){
				int sum=0;
				for(int i=0;i<a.length;i++){
					sum+=a[i];
				}
				return sum;
			}
			return Integer.MIN_VALUE;
		}
		if(a.length==0)
			return 0;
		if(b.length==0)
			return 0;
		
		return Math.max(a[0]+function(a1-1,b1,Arrays.copyOfRange(a,1,a.length),Arrays.copyOfRange(b,1,b.length)), b[0]+function(a1,b1-1,Arrays.copyOfRange(a,1,a.length),Arrays.copyOfRange(b,1,b.length)));
		
	}
}