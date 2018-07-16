/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
		Scanner s=new Scanner(System.in);
	public static void main (String[] args) {
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    char arr[]=new char[9];
			for(int o=0;o<9;o++){
				arr[o]=s.next().charAt(0);
			}
		    check(arr,9);
				
	    }
		
	}
	
	public static void check(char arr[],int a){
	    char ch=arr[0];
	    
	    
		int r=0;
	    for(int i=0;i<9;i++){
	        if(ch==arr[i]){
	            r++;
	        }
	    }
		//System.out.println("Point here "+r);
	    if(r==4||r==5){
	       int t=0;
	       char temp='v';   
	     if(arr[0]==arr[1] && arr[1]==arr[2]){
	       if(t==1){
	           if(temp!=arr[0]) System.out.println("Invalid");
			   else System.out.println("Valid 1");
				return;
		   }
	       else{
			t=1;
	        temp=arr[0];
	           
	       }
	     }
	     if(arr[0]==arr[3] && arr[3]==arr[6]){
	           if(t==1){
	           if(temp!=arr[0]) System.out.println("Invalid");
			   else System.out.println("Valid 2");
				return;
		   }
	       else{
	        t=1;
	        temp=arr[0];
	           
	       }
	     }
	     if(arr[0]==arr[4] && arr[4]==arr[8]){
	           if(t==1){
	           if(temp!=arr[0]) System.out.println("Invalid");
			   else System.out.println("Valid 3");
				return;
		   }
	       else{
	        t=1;
	        temp=arr[0];
	           
	       }
	         
	     }
	     if(arr[1]==arr[4] && arr[4]==arr[7]){
	           if(t==1){
	           if(temp!=arr[1]) System.out.println("Invalid");
			   else System.out.println("Valid 4");
				return;
		   }
	       else{
	        t=1;
	        temp=arr[1];
	           
	       }
	     }
	     if(arr[2]==arr[5] && arr[5]==arr[8]){
	           if(t==1){
	           if(temp!=arr[2]) System.out.println("Invalid");
			   else System.out.println("Valid 5");
				return;
		   }
	       else{
	        t=1;
	        temp=arr[2];
	           
	       }
	     }
	     if(arr[2]==arr[4] && arr[4]==arr[6]){
	           if(t==1){
	           if(temp!=arr[2]) System.out.println("Invalid");
			   else System.out.println("Valid 6");
				return;
		   }
	       else{
	        t=1;
	        temp=arr[2];
	           
	       }
	     }
	     if(arr[3]==arr[4] && arr[4]==arr[5]){
	           if(t==1){
	           if(temp!=arr[3]) System.out.println("Invalid");
			   else System.out.println("Valid 7");
				return;
		   }
	       else{
	        t=1;
	        temp=arr[3];
	           
	       }
	     }
	     if(arr[6]==arr[7] && arr[7]==arr[8]){
	           if(t==1){
	           if(temp!=arr[6]) System.out.println("Invalid");
			   else System.out.println("Valid 8");
			   return;
	       }
	       else{
	        t=1;
	        temp=arr[6];
	           
	       }
	     }
		 System.out.println("Valid");
		 return;
	    }
		else {
			System.out.println("Invalid");
			return;
		}
	    }
	}