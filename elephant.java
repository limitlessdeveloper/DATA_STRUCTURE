import java.util.*;
class Elephant{
	public static void main(String []args) {
		int arr[]={1,0,0,0,0,0,0,1,0,0,1,0,0,1},i,cnt=0;
		int size=arr.length;
		System.out.println("point here");
	for(i=0;i<size;i++){
		if(arr[i]==1){
			if(i==0)arr[i+1]=2;
			else if(i==(size-1))arr[i-1]=2;
			else{
				arr[i+1]=2;
				arr[i-1]=2;
			}
		}
	}
	for(i=0;i<size;i++){
		if(arr[i]==0)cnt++;
	}
	System.out.println(cnt);
	}
}