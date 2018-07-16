import java.util.*;
class Sample{
	public static void main(String []args){
		int arr[]={4, 5, 4, 5, 7, 9, 6, 8, 13};
		int l=arr.length;
		boolean arr[]=new boolean[l];
		int max=0;
		int in=0;
		int curr_max=Integer.MAX_VALUE;
		while(l-->0){
			max=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>=max && max<=curr_max){
					if(curr_max==max)
					max=arr[i];	
					in=i;
				}
			}
			
			System.out.print(in+" ");
		}
	}
}