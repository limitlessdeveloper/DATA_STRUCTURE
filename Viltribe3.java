import java.util.*;
import java.lang.*;

class Viltribe{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String t[]=new String[n];
		for(int i=0;i<n;i++){
			t[i]=s.next();																	
		}
		for(int i=0;i<n;i++){
			printSolution(t[i]);
		}
	}
	
	static void printSolution(String k){
			
		
		int cntA=0;
		int cntB=0;
		for(int i=0;i<k.length();i++){
			
			
			while(k.charAt(i)=='A'){
				int j=i+1;
				int cnt=0;
				while( j<k.length() && k.charAt(j)=='.' ){
					cnt++;
					j++;
				}
				if(j==k.length()){
					i=j-1;
					break;
				}
				if(k.charAt(j)=='A'){
					cntA=cntA+cnt;
					i=j;
					continue;
				}
				if(k.charAt(j)=='B'){
					i=j;
					break;
				}
			}
			while(k.charAt(i)=='B'){
				int j=i+1;
				int cnt=0;
				while(j<k.length() && k.charAt(j)=='.'){
					cnt++;
					j++;
				}
				if(j==k.length()){
					i=j-1;
					break;
				}
				if(k.charAt(j)=='B'){
					cntB=cntB+cnt;
					i=j;
					continue;
				}
				if(k.charAt(j)=='A'){
					i=j;
					break;
				}
			}
			
		}
		for(int i=0;i<k.length();i++){
			if(k.charAt(i)=='A') cntA++;
			if(k.charAt(i)=='B') cntB++;
		}
		
		System.out.println(cntA+"  "+cntB);
	}
}