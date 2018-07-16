/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.next());
		while(t-->0){
		    int n=Integer.parseInt(s.next());
            int a=Integer.parseInt(s.next());
            int b=Integer.parseInt(s.next());
		    int wa[]=new int[n];
		    int wb[]=new int[n];
		    int profit[]=new int[n];
		    for(int i=0;i<n;i++){
		        wa[i]=Integer.parseInt(s.next());
		    }
		    for(int i=0;i<n;i++){
		        wb[i]=Integer.parseInt(s.next());
		    }
		    for(int i=0;i<n;i++){
		        profit[i]=Math.abs(wa[i]-wb[i]);
		    }
		    HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		    for(int i=0;i<profit.length;i++){
		        if(map.get(profit[i])==null)
		            map.put(profit[i],new ArrayList<Integer>());
		        map.get(profit[i]).add(i);
		    }
		    ArrayList<Integer> list=new ArrayList<Integer>(map.keySet());
		    for(int i=list.size()-1;i>=0;i--){
		        for(Integer x:map.get(list.get(i)))
		            System.out.print(x+" ");
		    }
		    System.out.println();
		    int sum=0;
		    for(int i=list.size()-1;i>=0;i--){
		        for(Integer x:map.get(list.get(i))){
				   if(b==0 && a-->0){
					System.out.println("b");// profit array index wise.
					sum+=wa[x];
				   }
				   else if(a==0 && b-->0){
					System.out.println("a");// profit array index wise.
					sum+=wb[x];
				   }
				   else if(wb[x]>=wa[x] && b-->0 && n-->0){
		                sum+=wb[x];
		                System.out.println(b+" b "+" "+sum+" "+n+" ");
				   }
				   else if( wb[x]<=wa[x] && a-->0 && n-->0){
		                sum+=wa[x];
		                System.out.println(a+" a "+" "+sum+" "+n+" ");
				   }
		        }
		    }
		    System.out.println(sum);
		}
	}
}