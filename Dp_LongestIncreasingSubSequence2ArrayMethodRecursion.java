import java.util.*;
class SubSequence{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++){
				arr[j]=s.nextInt();
			}
			
			System.out.println(countMaxLength(arr,n));
		}
	}
	
	
	static int countMaxLength(int arr[],int n){
		int dmarr[]=new int[n];
		for(int i=0;i<n;i++)dmarr[i]=1;
		countLength(arr,n,dmarr);
		Arrays.sort(dmarr);
		return(dmarr[n-1]);
	}
	
	static void countLength(int arr[],int n,int dmarr[]){
		
			if(n==1)return;
			for(int i=1;i<n;i++){
				countLength(arr,i,dmarr);
				if(arr[i-1]<arr[n-1] && (dmarr[i-1]+1)>dmarr[n-1]){
					dmarr[n-1]=dmarr[i-1]+1;
				}
			}
			return;
	}
}
				