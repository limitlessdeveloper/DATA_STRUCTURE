
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.next());
		while(t-->0){
				int n=Integer.parseInt(s.next());
				int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(s.next());
			}
			StringBuffer zero=new StringBuffer();
			StringBuffer one=new StringBuffer();
			StringBuffer two=new StringBuffer();
			
			for(int x:arr){
				if(x==0){
					zero.append("0 ");
				}
				else if(x==1){
					one.append("1 ");
				}
				else{
					two.append("2 ");
				}
			}
			System.out.println((zero.append(one)).append(two));
	    }
		
	}
}