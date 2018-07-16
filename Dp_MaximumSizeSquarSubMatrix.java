import java.util.*;
class Matrix{
	public static void main(String  []args){
		int row=6;
		int col=5;
		int arr[][]={{0,1,1,0,1},{1,1,0,1,0},{0,1,1,1,0},{1,1,1,1,0},{1,1,1,1,1},{0,0,0,0,0}};
		System.out.println(calculateMaximumSize(arr,row,col));
	}
	
	
	static int calculateMaximumSize(int arr[][],int row,int col){
		int arr2[][]=new int[row][col];
		int maximum_size=0;
		
		for(int i=0;i<row;i++){
			arr2[i][0]=arr[i][0];
		}
		for(int i=0;i<col;i++){
			arr2[0][i]=arr[0][i];
		}
		
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				if(arr[i][j]==0)arr2[i][j]=0;
				else{
					arr2[i][j]=min(arr2[i-1][j],arr2[i-1][j-1],arr2[i][j-1]) + 1;
					if(arr2[i][j]>maximum_size) maximum_size=arr2[i][j];
				}
			}
		}
		
		return maximum_size;
	}
	
	static int min(int a,int b,int c){
		if(a<=b){
			if(a<=c) return a;
			else return c;
		}
		else if(b<=c) return b;
		else return c;
	}
}