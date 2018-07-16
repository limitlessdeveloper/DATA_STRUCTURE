import java.util.*;
import java.lang.*;

class Viltribe{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String t[]=new String[n];
		for(int i=0;i<n;i++){
			t[i]=s.next();																	//A..A..A...B
		}
		for(int i=0;i<n;i++){
			printSolution(t[i]);
		}
	}
	
	static void printSolution(String k){
				int cntA=0;
				int cntB=0;
				
		for(int i=0;i<k.length();i++){
				if(k.charAt(i)=='A'){
					int j=i+1;
					int cnt=0;
					
				while(k.charAt(j)!='B' && k.charAt(j)!='A'&& j<k.length()){
						cnt++;
						j++;
					}
					if(k.charAt(j)=='A') {
						System.out.println(j);
						cntA++;
						cntA=cntA+cnt;
						i=j;
						continue;
					}
					if(k.charAt(j)=='B'){
						i=j;
						cntA++;
					}
					if(j!=k.length())
					{
						cntA++;
						break;
					}
				}
				
				if(k.charAt(i)=='B'){
					int j=i+1;
					int cnt=0;
				while(k.charAt(j)!='B' && k.charAt(j)!='A'&& j<k.length()){
						cnt++;
						j++;
					}
					if(k.charAt(j)=='B') {
						cntB++;
						cntB=cntB+cnt;
						i=j;
						continue;
					}
					if(k.charAt(j)=='A'){
						i=j;
						cntB++;
					}	
					if(j!=k.length())
					{
						cntB++;
						break;
					}
				}
			}
				System.out.println((cntA)+" "+(cntB));
	}
}