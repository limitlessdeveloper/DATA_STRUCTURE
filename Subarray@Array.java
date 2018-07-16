import java.util.*;
class Sample{
		
 public static void main(String [] args) {
	 int arr[]={1,2,3,4,5,6};
     boolean b[]=new boolean[6];
	
	 printf(arr,3,0,0,b	);
 } 
 
  static void printf(int arr[],int key,int start,int end,boolean b[]){
	 if(end==key){
		 int sum=0;
		 
		 for(int i=0;i<arr.length;i++){
			 if(b[i]==true){ 
				sum+=arr[i];
			 }
		 }
		 if(sum<10){
			for(int i=0;i<arr.length;i++){
				if(b[i]==true)
				System.out.print(arr[i]);
			}
		System.out.println();
		return;
		}
	 }
	 if(start==arr.length) return;
	 b[start]=true;
	 printf(arr,key,start+1,end+1,b);
	 b[start]=false;
	 printf(arr,key,start+1,end,b);
 }
}