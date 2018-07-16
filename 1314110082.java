import java.util.*;
class TestClass{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=s.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=0;i<a;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				
				min=arr[i];
			}
			
		}
		System.out.println(max+"\n"+min);
	}
}