import java.util.*;
class LongestCommonSubSequence{
	public static void main(String []args){
		String s1="abcdaf";
		String s2="acbcf";
		System.out.println("the longest common SubSequence length is "+ longestSubsequence(s1,s2));
		
	}
	static int longestSubsequence(String s1,String s2){
		int t1=s1.length();
		int t2=s2.length();
		int arr[][]=new int[t2][t1];
		for(int i=0;i<t2;i++){
			for(int j=0;j<t1;j++){
				if(s2.charAt(i)==s1.charAt(j)){
					if(i==0 || j==0){
						arr[i][j]=1;
					}
					else{
						arr[i][j]=arr[i-1][j-1]+1;
					}
				}
				else{
					if(i==0 && j==0) {
					    arr[i][j]=0;
					}
					else if(i==0||j==0){
						if(i==0){
							arr[i][j]=arr[i][j-1];
					    }
					    else{
							arr[i][j]=arr[i-1][j];
						}
				    }
					else arr[i][j]=max(arr[i][j-1],arr[i-1][j]);
			    }

			}
		}
		printsequence(arr,s2,s1,t2-1,t1-1);
		System.out.println();
		return arr[t2-1][t1-1];
	}
	
	static int max(int a,int b){
		return((a>b)?a:b);
	}
	
	static void printsequence(int arr[][],String s2,String s1,int i,int j){
		
		if(i==0 && j==0){
			if(s2.charAt(i)==s1.charAt(j)){
				System.out.print(s2.charAt(i));
				return;
			}
			else return;
		}
		else{
		 
			if(s2.charAt(i)==s1.charAt(j)){
				printsequence(arr,s2,s1,i-1,j-1);
				System.out.print(s2.charAt(i));
				return;
			}
			else{
					if(arr[i==][j]==arr[i-1][j]){
					printsequence(arr,s2,s1,i-1,j);
					return;
					}
					else {
						printsequence(arr,s2,s1,i,j-1);
						return;
					}
			}
		}
	}
}