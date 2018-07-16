import java.util.*;
class SubSequenceOfAGivenLength{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5};
		boolean b[]=new boolean[5];
		printSubSequence(arr,3,0,0,b);
	}
	
	public static void printSubSequence(int arr[],int key,int start,int currPos,boolean b[]){
		if(currPos==key){
			for(int i=0;i<arr.length;i++){
				if(b[i]==true){
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		if(start==arr.length) return;
		
		b[start]=true;
		printSubSequence(arr,key,start+1,currPos+1,b);
		b[start]=false;
		printSubSequence(arr,key,start+1,currPos,b);
	}
}