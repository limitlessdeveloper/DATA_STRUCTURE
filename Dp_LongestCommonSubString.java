import java.util.*;
class LongestCommonSubString{
	public static void main(String []args){
		String s1="abcdef";
		String s2="zbcdf";
		printLongestCommonSubString(s1,s2,s1.length(),s2.length());
	}
	
	static void printLongestCommonSubString(String s1,String s2,int col,int row){
		int arr[][]=new int[row+1][col+1];
					 
		for(int i=0;i<=col;i++)arr[0][i]=0;
		for(int i=0;i<=row;i++)arr[i][0]=0;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				//System.out.println("point here "+s2.charAt(col-1));
				if(s2.\charAt(i-1)==s1.charAt(j-1)){
					arr[i][j]=arr[i-1][j-1]+1;
				}
				else{
					arr[i][j]=0;
				}
			}
		}
		printSubString(arr,s1,s2,s1.length(),s2.length());
	}
	
	static void printSubString(int arr[][],String s1,String s2,int col,int row){
		int r=0;
		int c=0;
		int max=0;
		for(int i=0;i<=row;i++){
			for(int j=0;j<=col;j++){
				  if(max<arr[i][j]){
					  max=arr[i][j];
					  r=i;
					  c=j;
					  }
			}
		}
		
		printString(arr,r,c,s1,s2);
	}
	
	static void printString(int arr[][],int row,int col,String s1,String s2){
		if(arr[row][col]==0)return;
		else{
			printString(arr,row-1,col-1,s1,s2);
			System.out.print(s1.charAt(col-1)+" ");
			return;
		}
	}
	
	
	
}