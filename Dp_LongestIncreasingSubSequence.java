import java.util.*;
class LongestSubSequence{
	public static void main(String []args){
		int arr[]={2,3,5,7,40,80,95};
		int n=arr.length;
		System.out.println("the longest sequence length is "+countLength(arr,n));
	}
	
	static int listCount(int[] arr,int n,int ini_length){
		if(n==1)return 1;
		int res,present_length=1;
		
		for(int i=1;i<n;i++){
			res=listCount(arr,i,ini_length);
			if(arr[i-1]<arr[n-1] && res+1>present_length){
				present_length=res+1;
			}
		}
		
		
		if(present_length>ini_length){
			ini_length=present_length;
		}
		
		return present_length;
	}
	
	static int countLength(int arr[],int n){
		int ini_length=1;
		return listCount( arr,n,ini_length);
	}
}