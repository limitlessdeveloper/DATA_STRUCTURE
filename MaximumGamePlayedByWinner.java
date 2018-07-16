import java.util.*;
class GamePlayed{
	public static void main(String []args){
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int n=s.nextInt();
			System.out.println(maxGame(n));
		}
	}
	static int maxGame(int n){
		if(n==1)return 0;
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=2;
		int i=2; 
		do{
			dp[i]=dp[i-1]+dp[i-2];
		}while(dp[i++]<=n);
		
		//i-2 coz i first time tb increase hua jab dp[i]==n ho gae the and 2nd time tb increase hua jab dp[i]>n ho gae the to i--,i-- for both term. 
		
		return(i-2);      
	}
}