import java.util.*;
import java.lang.*;

class HCF_LCM{
	public static void main(String args[]){
			
			int l=args.length;
			int arr[]=new int[l];
			for(int i=0;i<l;i++){
			 arr[i]=Integer.parseInt(args[i]);
			}
			
			int min=arr[0];
			for(int i:arr)
				if(i<min) min=i;
			
				
				System.out.println("point here "+min);
				
				
			while(min!=0){
				int j;
				for(j=0;j<arr.length;j++){
					if(arr[j]%min!=0) break;
				}
				if(j==arr.length){
					System.out.println(min);
					break;
				}
				min--;
			}
	}
}