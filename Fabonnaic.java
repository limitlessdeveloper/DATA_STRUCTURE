import java.util.*;
class Sample{
	public static void main(String []args){
		for(int i=0;i<5;i++){
			System.out.print(fibo(i)+" ");
		}
	}
	
	static int fibo(int n){
		if(n==0)return 0;
		else if(n==1)return 1;
		else return(fibo(n-1)+fibo(n-2));
	}
}