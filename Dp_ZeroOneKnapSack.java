import java.util.*;
class KnapSack{
	public static void main(String []args){
		int wt[]={1,3,4,5};
		int val[]={1,4,5,7};
		int totalweight=7;
		countMaxValue(wt,val,totalweight);
	}
	
	static void countMaxValue(int []wt,int []val,int totalweight){
		int arr[][]=new int[wt.length][totalweight+1];
		for(int i=0;i<wt.length;i++){
			arr[i][0]=0;
		}
		for(int i=0;i<wt.length;i++){
			for(int j=1;j<=totalweight;j++){
				if(i==0){
					if(wt[i]<=j) arr[i][j]=val[i];
				}
				else{
					if(wt[i]>j) arr[i][j]=arr[i-1][j];
					else{
						arr[i][j]=max(arr[i-1][j],val[i]+arr[i-1][j-wt[i]]);
					}
				}	
			}
		}
		
		printArray(arr,wt.length,totalweight);
		printWeightAndValue(arr,wt,val,totalweight);
	}
	
	static void printArray(int [][]arr,int row,int column){
		 for(int i=0;i<row;i++){
			 for(int j=0;j<=column;j++){
				 System.out.print( arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
	
	static int max(int a,int b){
		return(a>b?a:b);
	}
	
	static void printWeightAndValue(int [][]arr,int wt[],int val[],int totalweight){
		int i=wt.length-1;
		int j=totalweight;
		while(j!=0){
			if(arr[i][j]==arr[i-1][j]){
				i=i-1;
			}
			else if(arr[i][j]==val[i]+arr[i-1][j-wt[i]]){
				System.out.println(wt[i]+ " "+val[i]);
				j=j-wt[i];
				i=i-1;
			}
			System.out.println("point here");
		}
	}
}