import java.util.*;
class HeapSort{
	public static void main(String args[]){
		int arr[]={31,12,53,4,65};
			heapsort(arr,5);
			System.out.println(Arrays.toString(arr));
	}
	
	public static void heapsort(int arr[],int n){
		for(int i=n/2-1;i>=0;i--){
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--){
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			heapify(arr,i,0);
		}
	}
	
	public static void heapify(int arr[],int n,int i){
		int larg=i;
		int l=2*i + 1;
		int r=2*i + 2;
		if(l<n && arr[larg]<arr[l]) 
			larg=l;
		if(r<n && arr[larg]<arr[r])
			larg=r;
		if(larg!=i){
			int temp=arr[larg];
			arr[larg]=arr[i];
			arr[i]=temp;
			
			heapify(arr,n,i);
		}
	}
}