import java.util.*;


class PoliceShooting{
	
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();														
		int arr[]=new int[t];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
			int arr1[]=new int[arr[i]];
			for(int j=0;j<arr[i];j++){
				arr1[j]=s.nextInt();
			}
			calculateResult(arr1);
		}
	}
	
	static void calculateResult(int[] arr){
		Arrays.sort(arr);                                               // this method is to sort an array...
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				System.out.println("He is no more");
				break;
			}
			else if(cnt==6){
				i-=1;
				cnt=0;
			}
			else{
				cnt++;
				arr[i]=(-1);
			}
			for(int j=i+1;j<arr.length;j++){
				arr[j]-=1;
			}
			if(i==arr.length-1)
			System.out.println("He Won the War");
		}
	}
}