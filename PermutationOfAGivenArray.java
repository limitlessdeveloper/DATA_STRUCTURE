import java.util.*;
class PermutationOfAGivenArray{
	public static int cnt=0;
	public static void main(String args[]){
		int a=5;
		int arr[]={1,2,3,4,5};
		printPermutation(arr,0,a-1);					//While printing all the permutation of the given string "0" is a starting value and a-1 is the length of the given array.	
		System.out.println(cnt);
	}
	
	static void printPermutation(int arr[],int s,int a){
		if(s==a){
			System.out.println(Arrays.toString(arr));
			cnt++;
		}
		else{
			for(int i=s;i<=a;i++){
				swap(arr,s,i);
				printPermutation(arr,s+1,a);
				swap(arr,s,i);
			}
		}
	}
	
	static void swap(int arr[],int b,int c){
		int temp=arr[b];
		arr[b]=arr[c];
		arr[c]=temp;
		return;
	}
}