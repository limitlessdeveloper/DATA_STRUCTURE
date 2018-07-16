import java.util.*;
import java.lang.*;
class Sample{
	public static void main(String args[]){
		Scanner  s = new Scanner(System.in);
		int n=5;
		int p[]={1, 2, 3, 4};
		int profit[]={2, 5, 7, 8};
		int arr[][]=new int[p.length][5+1];
		for(int i = 0 ; i <p.length ; i++){
			for(int j = 0; j<=n; j++){
				if(i==0){
					arr[i][j]=j*profit[i];
				}
				if(i>0 && i<j){
					arr[i][j]=Math.max(arr[i-1][j],(arr[i][j-p[i]])+profit[i]);
				}
				if(i>=j && i>0){
							arr[i][j]=arr[i-1][j];
				}
			}
		}
		int i=3,j=5;
		while(i!=0 && j!=0){
			if(arr[i][j]==arr[i-1][j]){
				i=i-1;
			}
			else{
				if(arr[i][j]==((arr[i][j-p[i]])+profit[i])){
					System.out.print( p[i]+" ");
					j=j-p[i];
				}
			}
		}
		if(i==0 && j!=0){
			while(j!=0){
				if(arr[i][j]==((arr[i][j-p[i]])+profit[i])){
					System.out.print( p[i]+" ");
					j=j-p[i];
				}
			}
		}
		System.out.println();
		
		for( i=0;i<p.length;i++){
			for( j=0;j<=n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
