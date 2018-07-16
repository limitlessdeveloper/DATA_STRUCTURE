import java.util.*;
import java.lang.*;

class Sample{
	public static void main(String args[]){
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		int Ans[]=new int[t];
		for(int i=0;i<t;i++){
			int N=s.nextInt();
			int R=s.nextInt();
			int A[]=new int[N];
			for(int j=0;j<N;j++){
				A[j]=s.nextInt();
			}
			A[N-1]=R;
			Ans[i]=findCorrect(A);
		}
		for(int i=0;i<t;i++){
			if(Ans[i]==0) System.out.println("YES");
			else System.out.println("NO ");
		}
	}
	
	static int findCorrect(int a[]){
		int f1=0;
		for(int i=2;i<a.length;i++){
			if(a[i-2]>=a[i-1]){
				if(a[i]>=a[i-1]&&a[i]<=a[i-2]) continue;
				else if(a[i]<=a[i-1]) continue;											///5123 783 3300 693 890
				else{
					f1=-1;
					break;
				}
			}
			else{
				if(a[i]>=a[i-2]&&a[i]<=a[i-1]) continue;
				else if(a[i]>=a[i-1]) continue;
				else{
					f1=-1;
					break;
				}
			}
		}
		return f1;
	}
}