import java.lang.*;
import java.util.*;
public class RainWater1{
		public static void main(String [] args ){
			System.out.println("The Maximum ammount of water it can store is: "+findwater(arr.length));
		}
		static int arr[]= {3,0,0,2,0,4};
		static int findwater(int n){
			int left[] = new int[n];
			int right[]= new int[n];
			
			int water=0;
			left[0]=arr[0];
			
			for(int i=1;i<n;i++){
				left[i]=Math.max(left[i-1],arr[i]);
			}
			right[n-1]=arr[n-1];
			for(int i=n-2;i>=0;i--){
				right[i]=Math.max(right[i+1],arr[i]);
			}
			for(int i=0;i<n;i++){
				water+=Math.max(left[i],right[i])-arr[i];
			}
			return water;
		}
}