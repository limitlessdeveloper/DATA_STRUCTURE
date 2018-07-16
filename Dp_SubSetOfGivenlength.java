import java.util.*;
class SubSet{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5};
		boolean b[]=new boolean[arr.length]; 
		printSubSet(arr,3,0,0,b);
	}
	
	static void printSubSet(int arr[],int key,int start,int currentP,boolean []b){
		if(currentP==key){
			for(int i=0;i<arr.length;i++){
				if(b[i]==true){
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		if(start==arr.length){
			return;
		}
		
		b[start]=true;
		printSubSet(arr,key,start+1,currentP+1,b);
		b[start]=false;
		printSubSet(arr,key,start+1,currentP,b);
	}
}