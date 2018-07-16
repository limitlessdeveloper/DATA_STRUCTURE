// // import java.util.*;
// // import java.lang.*;
// // class Sample{
	// // public static void main(String args[]){
		// // System.out.println(Math.sqrt(4));
		// // System.out.println(Math.round(45.67));
		// // System.out.println(Math.abs(-132));
		// // System.out.println(Math.max(-4,5));
	// // }
// // }

// /*package whatever //do not write package name here */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Sample{
	// public static void main (String[] args) {
		// Scanner s=new Scanner(System.in);
		// int t=Integer.parseInt(s.next());
		// while(t-->0){
		    // Long n=Long.parseLong(s.next());
		    // Long a=0l,b=1l,c;
			// for(int i=0;i<n;i++){
				// c=a+b;
				// a=b;	
				// b=c;
				// System.out.print(a+" ");
		    // }
		    // System.out.println();
		// }
	// }
// }

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sample D {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.next());
		while(t-->0){
		    int n=Integer.parseInt(s.next());
		    int arr[]=new int[n];
		    for(int i=1;i<=n;i++){
		        for(int j=i;j<=n;j++){
		         if(j%i==0){
		             if(arr[i-1]==0)
		             arr[i-1]=1;
		             else
		             arr[i-1]=0;
		         }   
		        }
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}