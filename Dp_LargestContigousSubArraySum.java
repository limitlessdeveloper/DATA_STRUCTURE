import java.util.*;
class LargestSum{
	public static void main(String[] args){
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		largestSubArraySum(arr);
	}
	
	static void largestSubArraySum(int arr[]){
		int t=arr.length;
		int maximum_sum=0,ini=0,fnl=0;
		if(t>0){
				for(int k=1;k<t;k++){
					for(int j=0;j<=k;j++){
						int sum=0;
						for(int i=j;i<=k;i++){
								sum=sum+arr[i];
						}
						if(sum>=maximum_sum){
							maximum_sum=sum;
							ini=j;
							fnl=k;
						}
					}
				}
			}
			System.out.println("Longest SubArraysum is "+ maximum_sum);
			System.out.println("SubArray is ");
			for(int i=ini;i<=fnl;i++) System.out.print(arr[i]+" ");
	}
}