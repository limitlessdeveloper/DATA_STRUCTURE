import java.util.*;
class Test22{
	public static void main(String []args){
		System.out.println("min of 7,5,8 is "+min(7,5,8));
	}
	
	static int min(int a,int b,int c){
		if(a<b){
			if(a<c) return a;
			else return c;
		}
		else if(b<c) return b;
		else return c;
	}
}