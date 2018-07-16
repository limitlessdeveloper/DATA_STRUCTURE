import java.util.*;
class Sample{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5};
		int a[]=new int[arr.length];
		//System.out.println(a[4]);
		printSubset(arr,0,a);
	}
	
	static void printSubset(int arr[],int n,int a[]){
		if(n==arr.length-1){
			a[n]=0;
			for(int i=0;i<arr.length;i++){
				if(a[i]==1)
					System.out.print(arr[i]+" ");
			}
			System.out.println();
			a[n]=1;
			for(int i=0;i<arr.length;i++){
				if(a[i]==1){
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		a[n]=0;
		printSubset(arr,n+1,a);
		a[n]=1;
		printSubset(arr,n+1,a);
	}
}