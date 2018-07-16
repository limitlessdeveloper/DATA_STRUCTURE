import java.util.*;
class Sample{
		
 public static void main(String [] args) 
    {	
		int arr[]={3,7,5,20,-10,0,10};
		int n=7,k=2;
		int current_sum=0;
		for(int i=0;i<k;i++) 
			current_sum+=arr[i];
		int sum=current_sum;
		int pos=0;
		for(int i=k;i<n;i++){
			current_sum+=arr[i]-arr[i-k];
			if(current_sum<sum){
				sum=current_sum;
				pos=i-k+1;
			}
		}
		int last=pos+k-1;
	System.out.println("["+pos+","+last+"]");
    }
	

}