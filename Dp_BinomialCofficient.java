import java.util.*;
import java.lang.*;

class Cofficient{
	public static void main(String []args){
		System.out.println("Binomial coefficient of (10,2) is "+b_Cofficient(10,2));	
		System.out.println("Binomial coefficient of (10,2) by DP is "+(rekhit(10,2)-(10-2)));	
	}
	 static long b_Cofficient(int a,int b){
		long ans=factNum(a)/(factNum(a-b)*factNum(b));
		return ans;
	}
	static int factNum(int c){
		if(c==0||c==1){
			return 1;
		}
		else{
			return(c*factNum(c-1));
		}
	}
	
	static int rekhit(int a,int b){
			if(a==b || b==0)return 1;
			else if(b==1)return a;
			else return(rekhit(a-1,b) + rekhit(a,b-1));
	}
} 