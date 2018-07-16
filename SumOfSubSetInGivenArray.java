import java.util.*;
class SubSetSum{
	public static void main(String []args){
		int arr[]={5,4,3};
		printSum(arr,0,2);
	}
	static void printSum(int arr[],int ini,int end,int sum=0){
		if(ini>end){
			System.out.println(sum);
			return;
		}
		else{
			printSum(arr,ini+1,end,sum+arr[ini]);
			printSum(arr,ini+1,end,sum);
		}
	}
}