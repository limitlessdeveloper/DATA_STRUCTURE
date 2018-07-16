import java.util.*;
class PowerOfGivenNumber{
	public static void main(String args[]){
		int a=10,b=8;
		System.out.println(pow(10,8));
	}0
	
	public static int pow(int a,int b){
		int res=1;
		while(b!=0){
			if((b&1)==1) res*=a;
			b/=2;
			a*=a;
		}
		System.out.println(a);
		return res; 	 
	}
}