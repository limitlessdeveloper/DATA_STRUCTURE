import java.util.*;
class MinimumCoin{
	public static void main(String []args){
		int coin[]={25,10,5};
		int sum=30;
		countMinimumCoin(coin,sum);
	}
	
	static void countMinimumCoin(int coin[],int sum){
		int findcoin[]=new int[sum+1];        //minimum coin count
		int cmin[]=new int[sum+1];
		findcoin[0]=0;
		cmin[0]=-1;
		for(int i=1;i<=sum;i++){
			findcoin[i]=999;
			cmin[i]=-1;
		}
		for(int j=0;j<coin.length;j++){
			for(int i=1;i<=sum;i++){
				if(i>=coin[j]){
					findcoin[i]=min(findcoin[i],1+findcoin[i-coin[j]]);
					if(min(findcoin[i],1+findcoin[i-coin[j]])==1+findcoin[i-coin[j]]){
						cmin[i]=j;	
					}
				}
			}
		}
		System.out.println("the minimum number of coin required is "+ findcoin[sum]);
		printCoins(coin,cmin,sum);
	}
	
	
	static int min(int a,int b){
		return(a>b?b:a);
	}
	
	static void printCoins(int coin[],int cmin[],int sum){
		int start=sum;
		while(start!=0){
			System.out.print(coin[cmin[start]]+" ");
			start=start-coin[cmin[start]];
		}
	}
}