import java.util.*;
class Permutation{
	static int cnt=0;
	public static void main(String []args){
		//Permutation obj=new Permutation();
		String s="abcde";
		char arr[]=s.toCharArray(); // to convert string into array
		//System.out.println(arr[0]);
		printPermutation(arr,0,arr.length-1);
		System.out.println(cnt);
	}
	
	static void printPermutation(char []arr,int s_length,int ar_length){
		if(s_length==ar_length){
			System.out.println(Arrays.toString(arr));
			cnt++;
		}
		else{
			for(int i=s_length;i<=ar_length;i++){
				swap(s_length,i,arr);
				printPermutation(arr,s_length+1,ar_length);
				swap(s_length,i,arr);// backtracking
			}
		}
	}
	
	static void swap(int a,int b,char arr[]){
		char temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
