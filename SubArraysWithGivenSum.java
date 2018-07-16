import java.util.*;
class SubArrays{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int n=s.nextInt();
			int sum=s.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++){
				arr[j]=s.nextInt();
			}
			printIndex(arr,sum);
		}
	}
	
	static void printIndex(int []arr,int sum){
		for(int i=0;i<arr.length;i++){
			int total=0;
			for(int j=i;j<arr.length;j++){
				total=total+arr[j];
				if(total>sum)break;
				else if(total==sum){
					System.out.println((i+1)+" "+(j+1));
					break;
				}
				else continue;
			}
			if(total== sum)break;
		}
	}
}