import java.util.*;
import java.lang.*;

class main{
	public static void main(String []args){
		System.out.println("Enter the elements in an array");
		int []arr={-4,9,15,-10,4,1,5};
		int x=5,r=0,s=6;
		
		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++){
				if(arr[j]>=arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}									//1 2 3 6 7 8 9
		
		for(int i=0;i<=6;i++){
			
			if(r>6 && s<0) break;
			else{
			int t=arr[r]+arr[s];
				if(t==x){
					System.out.println("("+arr[r]+","+arr[s]+")");
					r=r++;s--;
				}
				else if(t<x)
					r++;
				else s--;
			}
		}
		for(int i=0;i<7;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}