import java.util.*;
class CoinProblem{																					//*********important****
	public static void main(String []args){
		int coin[]={1,5,6,8};
		Arrays.sort(coin);
		int len=coin.length;
		int sum=11;
		countCoin(coin,len,sum);
	}
	
	static void countCoin(int coin[],int length,int sum){
		int arr[][]=new int[length][sum+1];
		
		for(int i=0;i<length;i++) arr[i][0]=0;
		for(int i=1;i<(sum+1);i++){
			if(i>=coin[0]){
				arr[0][i]=minPossibleValue(coin[0],coin[0],i);
			}
			else{
				arr[0][i]=0;
			}
		}
		for(int i=1;i<length;i++){
			for(int j=1;j<(sum+1);j++){
				if(j>=coin[i]){
					arr[i][j]=min((arr[i-1][j]),(arr[i][j-coin[i]]+1));
				}
				else{
					arr[i][j]=arr[i-1][j];
				}
			}
		}
		printMatrix(arr,length,sum);
		printCoins(arr,coin,length-1,sum);
	}
	
	static void printMatrix(int arr[][],int l,int sum){
		for(int i=0;i<l;i++){
			for(int j=0;j<=sum;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int minPossibleValue(int num,int dum,int sum){
		if(dum>sum)return 0;
		else if(dum==sum)return 1;
		else{
			 if(minPossibleValue(num,dum+num,sum)==0)return 0;
			 else return(minPossibleValue(num,dum+num,sum)+1);
		}
	}
	
	static void printCoins(int arr[][],int coin[],int len,int sum){
		if(sum==0){
			return;
		}
		else if(sum>=coin[len]){
			if(len==0){
				printCoins(arr,coin,len,sum-coin[len]);
				System.out.print(coin[len]+" ");
				return;
			}
			else{	
				if(min(arr[len-1][sum],arr[len][sum-coin[len]]+1)==arr[len-1][sum]){
					printCoins(arr,coin,len-1,sum);
					return;
				}
				else{
					printCoins(arr,coin,len,(sum-coin[len]));
					System.out.print(coin[len]+" ");
					return;
				}
			}
		}
		else{
			printCoins(arr,coin,len-1,sum);
		}
	}
	
	
	static int min(int a,int b){
		return((a>b)?b:a);
	}
	
}