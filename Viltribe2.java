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
			
		char x;
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
					cntA++;
					i=j-1;
					break;
				}
				if(k.charAt(j)=='A'){
					cntA=cntA+cnt+1;
					i=j;
					continue;
				}
				if(k.charAt(j)=='B'){
					cntA++;
					cntB++;
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
					cntB++;
					i=j-1;
					break;
				}
				if(k.charAt(j)=='B'){
					cntB=cntB+cnt+1;
					i=j;
					continue;
				}
				if(k.charAt(j)=='A'){
					cntB++;
					cntA++;
					i=j;
					break;
				}
			}
			
		}
		
		System.out.println(cntA+" "+cntB);
	}
}