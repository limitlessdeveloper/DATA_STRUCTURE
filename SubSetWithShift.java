import java.util.*;
class SubSet{
	public static void main(String []args){
		int arr[]={1,2,3};
		printSubSet(arr);
	}
	
	static void printSubSet(int arr[]){
		int n=arr.length;
		for(int i=0;i<(1<<n);i++){
			for(int j=0;j<n;j++){
				if((i&(1<<j))>0){
					System.out.print(arr[j]+" ");
				}
			}
		System.out.println();
		}
	}
}