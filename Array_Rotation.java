import java.util.*;
class ArrayRotation{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7};
		int n=arr.length;
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		rotate_array(arr,n,x);
	}
	
	public static void rotate_array(int arr[],int n,int x){
		int temp;
		for(int i=0;i<x;i++){
			temp=arr[0];
			for(int j=1;j<7;j++){
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
		for(int i=0;i<7;i++){
			System.out.print(arr[i]+" ");
		}
	}
}