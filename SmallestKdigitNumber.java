import java.util.*;
import java.math.*;

class Sample{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int x[]=new int[T];
		int k[]=new int[T];
		
		for(int i=0;i<T;i++){
			x[i]=s.nextInt();
			k[i]=s.nextInt();
			 printSmallestDivisible(x[i],k[i]);
		}
	}
	
	static void printSmallestDivisible(int x,int k){
		int i=1;
		int r=x;
		int num=(int)Math.pow(10, (k-1));
		while((r/num)<1){
			r=x*i;
			//System.out.println("point here "+r);
			i++;
		} 
		System.out.println(r+" "+(r/num));
		return;
	}
}