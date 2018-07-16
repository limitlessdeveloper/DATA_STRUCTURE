import java.util.*;
class BasicGreedy{
	public static void main(String []args){
		
		int start[]={1,0,0,5,8,5};
		int finish[]={2,4,6,7,9,9};
		
		int arr[]=new int[start.length];
		int arrind[]=new int[start.length];
		for(int i=0;i<start.length;i++){
			arr[i]=finish[i]-start[i];
			arrind[i]=i;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[j]<arr[j-1]){          
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
					temp=arrind[j-1];
					arrind[j-1]=arrind[j];
					arrind[j]=temp;
				}
			}
		}
		int user=4;
		
		for(int i=0;i<4;i++){
			for(int j=1;j<4;j++){
				if(arrind[j]<arrind[j-1]){
					int temp=arrind[j-1];
					arrind[j-1]=arrind[j];
					arrind[j]=temp;
				}
			}
		}
		for(int j=0;j<user;j++){
			System.out.print(arrind[j]+" ");
		}
		
		System.out.println("\nBy Greedy algorithm");  ///with greedy algorithm the extra data structure will not needed
		
		for(int i=0;i<finish.length;i++){
			
			for(int j=1;j<finish.length;j++){
				
				if(finish[j]<=finish[j-1]){
					int temp =finish[j-1];
					finish[j-1]=finish[j];
					finish[j-1]=temp;
				
					temp=start[j-1];
					start[j-1]=start[j];
					start[j]=temp;
				}
			}
		}
		int j=0;
		System.out.print("("+start[0]+","+finish[0]+") ");
		for(int i=1;i<finish.length;i++){
			if(finish[j]<start[i]){
				System.out.print("("+start[i]+","+finish[i]+") ");
				j=i;
			}
		}
		
	}
}