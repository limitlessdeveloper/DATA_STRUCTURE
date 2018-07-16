import java.util.*;
class SubSetSum{
	public static void main(String []args){
		int a[]={2,3,7,8,10};
		int sum=11;
		printSubSetofGivenSum(a,sum);
	}
	
	static void printSubSetofGivenSum(int a[],int sum){
		boolean arr[][]=new boolean[a.length][sum+1];
		for(int i=0;i<=sum;i++){
			if(a[0]==i) arr[0][i]=true;
			else arr[0][i]=false;
		}
		for(int i=0;i<a.length;i++)arr[i][0]=true;
		for(int i=1;i<a.length;i++){
			for(int j=1;j<=sum;j++){
				if(a[i-1]<=j){
					if(arr[i-1][j]==true)arr[i][j]=arr[i-1][j];
					else arr[i][j]=arr[i-1][j-a[i-1]];
				}
				else{
					arr[i][j]=arr[i-1][j];
				}
			}
		}
		printNumbers(arr,a,a.length-1,sum);
	}
	
	static void printNumbers(boolean arr[][],int a[],int row,int col){
		while(col!=0){
			if(col>=a[row]){
				if(arr[row-1][col]==true)
					row=row-1;
				else{
					System.out.println(a[row]);
					col=col-a[row];
					row=row-1;
				}
			}
			else{
				row=row-1;
			}
		}
	}
}
