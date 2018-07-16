import java.util.*;
import java.lang.*;
class Ractangle{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int arr[][]=new int[T][4];
		for(int i=0;i<T;i++){
			for(int j=0;j<4;j++){
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<T;i++){
			int cnt2=0;
			for(int j=0;j<4;j++){
				int cnt=0;
				for(int k=0;k<4;k++){
					if(arr[i][j]==arr[i][k]) cnt++;
				}
				if(cnt!=2){
					cnt2=2;
					break;
				}
			}
			if(cnt2==0)System.out.println("YES");
			if(cnt2==2)System.out.println("NO");
		}		
	}
}