import java.util.*;
import java.lang.*;

class Sample{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.next());
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(s.next());
		}
		int profit[]=new int[n];
		for(int i=0;i<n;i++){
			profit[i]=0;
		}
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--){
			if(arr[i]>max)
				max=arr[i];
			profit[i]=Math.max(max-arr[i],profit[i+1]);
		}
		int min=arr[0];
		for(int i=1;i<n;i++ ){
			if(arr[i]<min)
				min=arr[i];
			profit[i]=Math.max(profit[i-1],profit[i]+(arr[i]-min));
		}
		
		System.out.println(profit[n-1]);
	}
}