import java.util.*;
import java.lang.*;
class SubArray{
	public static void main(String []args){
		// Scanner s =new Scanner(System.in);
		// int t=s.nextInt();
		// for(int i=0;i<t;i++){
			// int a=s.nextInt();
			// int arr[]=new int[a];
			// for(int j=0;j<a;j++){
				// arr[j]=s.nextInt();
			// }
			int arr[]={1,2,3,4};
			calSubArray(arr);
		
	}
	
	static void calSubArray(int []arr){
		double t=Math.pow(2,arr.length);
		int r=(int)t-1;
		int cnt=0;
		System.out.println();
		for(int i=1;i<=r;i++){
			ArrayList<Integer> list=new ArrayList<Integer>();
			calBinary(i,list);
			for(int j=0;j<list.size();j++){
				System.out.print(list.get(j));
				//if(list.get(j)==1)System.out.print(arr[j]+" ");
			}
			if(list.size()>0)cnt++;
			System.out.println();
		}
		System.out.println();
		System.out.println(cnt);
	}
	
	static void calBinary(int a,ArrayList<Integer> list){
		while(a!=0){
			list.add(a%2);
			a=a/2;
		}
	}
}