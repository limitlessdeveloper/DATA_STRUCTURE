import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args){
	    
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int []m=new int[T];
		int []k=new int[T];
		int []n=new int[T];
		for(int i=0;i<T;i++){
		    m[i]=s.nextInt();
		    k[i]=s.nextInt();
		    n[i]=s.nextInt();
		}
		
		for(int i=0;i<T;i++){
		    System.out.println(findChar(m[i],k[i],n[i]));
		}
	}
	static char findChar(int temp,int k,int n){	
	    
            	String bin=new String();
	        	String res=new String();
	        	while(temp!=0){
	        	    if(temp%2!=0){
	        	        bin=bin+(temp%2);
	        	    }
	        	    else{
	        	        bin=bin+0;
	         	    }
        		    temp=temp/2;
        		}
        		if(n<=bin.length()){
        		for(int i=0;i<n;i++){
	          	    int r=Character.getNumericValue(bin.charAt(i));
	    	        if(r==0){
	    	            res=res+"01";
	    	         }
	    	        else{
	    	            res=res+"10";
	    	            }
        		    }
        		}
        		if(0<=k && k<res.length())
                    return(res.charAt(k));
	            else return('\u0000');
	}
}