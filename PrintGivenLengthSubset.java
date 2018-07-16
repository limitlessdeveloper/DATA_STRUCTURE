import java.util.*;
import java.lang.*;
class Subset{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int n=s.nextInt();
			int k=s.nextInt();
			hchint arr[]=new int[n];
			for(int e=0;e<n;e++){
				arr[e]=s.nextInt();
			}
			printSubset(arr,k);
		}
	}
	
	
	static void printSubset(int arr[],int k){
		int l=arr.length;
		double n=(Math.pow(2,l))-1;
		for(int i=1;i<=n;i++){
			ArrayList<Integer> list=ArrayList<Integer>();
			formBinary(list,i);
		}
	}
	
	static void formBinary(ArrayList<Integer> list,int n){
		while(n!=0){
			list.add(n%2);
			n=n/2;
		}
	}
}