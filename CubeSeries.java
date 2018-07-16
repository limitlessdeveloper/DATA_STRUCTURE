import java.util.*;
class CubeSeries{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++){
			System.out.print(i+"^3");
			sum=sum+cube(i);
			if(i!=n)System.out.print(" + ");
		}
		System.out.print("="+sum);
	}
	static int cube(int a){
		return(a*a*a);
	}
}