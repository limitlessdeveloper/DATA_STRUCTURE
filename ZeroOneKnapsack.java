import java.lang.*;
import java.util.*;
public class ZeroOneKnapsack {
			public static void main(String [] args){
				int wt[]={1,3,4,5};
				int val[]={1,4,5,7};
				int kwt=7;
				knapsack(wt,val,kwt);
			}
			static void knapsack(int []wt,int []val,int kwt){
				int l[][]=new int[wt.length+1][kwt+1];
				for(int i=0;i<=wt.length;i++){
					for(int j=0;j<=kwt;j++){
						if(i==0 || j==0){
							l[i][j]=0;
						}else if(wt[i-1]<=j){
							l[i][j]=Math.max(val[i-1]+l[i-1][j-wt[i-1]],l[i-1][j]);
						}
						else{
							l[i][j]=l[i-1][j];
						}
					}
				}
				for(int i=0;i<=wt.length;i++){
					for(int j=0;j<=kwt;j++){
						System.out.print(l[i][j]+"  ");
					}
					System.out.println();
				}
			}
}