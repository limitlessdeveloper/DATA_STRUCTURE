import java.util.*;
class Matrix{
	public static void main(String []ags){
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=1;
			}
		}
		arr[2][1]=-1;
		System.out.println(countPath(arr,3,3));
	}
	
	static int countPath(int[][] arr,int a,int b){
		if(arr[a-1][b-1]==-1)return 0;
		else if(a==1 || b==1)return 1;
		else{
			return(countPath(arr,a-1,b) + countPath(arr,a,b-1));
		}
	}
}
