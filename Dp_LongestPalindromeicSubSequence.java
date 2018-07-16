import java.util.*;
class PalindromicSecquence{
	public static void main(String []args){
		String s="agbdba";
		printSPalindrome(s,s.length());
	}
	
	static void printSPalindrome(String s,int length){						//*************  TIME COMPLAXITY == O(n^2);
		int arr[][]=new int[length][length];
		
		for(int l=1;l<=length;l++){
			for(int i=0,j=l-1;i<length && j<length;i++,j++){
				if(s.charAt(i)==s.charAt(j)){
					if(l==1){
						arr[i][j]=1;
					}
					else if(l==2){
						arr[i][j]=2;
					}
					else{
						arr[i][j]=2+arr[i+1][j-1];
					}
				}
				else{
					arr[i][j]=max(arr[i][j-1],arr[i+1][j]);
				}
			}
		}
		
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		printPalindrome(arr,s,0,length-1);
	}
	
	static void printPalindrome(int arr[][],String s,int row,int col){
		if(row==col){
			System.out.print(s.charAt(row)+" ");
			return;
		}
		else{
			if(s.charAt(row)==s.charAt(col)){
				System.out.print(s.charAt(row)+" ");
				printPalindrome(arr,s,row+1,col-1);
				System.out.print(s.charAt(col)+" ");
				return;
			}
			else{
				if(max(arr[row][col-1],arr[row+1][col])==arr[row][col-1]){
					printPalindrome(arr,s,row,col-1);
					return;
				}
				else{
					printPalindrome(arr,s,row+1,col);
					return;
				}
			}
		}
	}
	
	static int max(int a,int b){
		return(a>b?a:b);
	}
}
