import java.util.*;
import java.math.*;

class Sample{
	public static void main(String []args){
		int arr[]={5,10,11,12,13,15,16,17,18,19,20,25,30,35	};
		int flag=findAP(arr,arr.length);
		System.out.println("\nthe length of the Ap is : "+flag);
	}
	
	static int findAP(int []arr,int n){
		int flag=0;
		for(int j=1;j<n-1;j++){
			int i=j-1,k=j+1;
				
				while(i>=0 && k<=(n-1)){
					if(arr[i]+arr[k]==2*arr[j]){
						flag=3;
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+" ");
						int q=(arr[k]-arr[i])/2;
						k++;
						while(k<=n-1){
							if((arr[k]-arr[i])%q==0){
								flag=flag+1;
								System.out.print(arr[k]+" ");
							}
							k++;
						}
						break;
					}
					if((arr[i]+arr[k])<2*arr[j]) k++;
					else i--;
				}
				if(flag>0) break;
		}
		return flag;
	}
}