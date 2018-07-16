import java.util.*;
class MonkeyClimbing{
	public static void main(String []args){
		int a=5;
		int steps=check(11);
		System.out.println(steps);
	}
	
	public static int check(int a){
		if(a==0||a==1) return 1;
		else{
			return(check(a-1)+check(a-2));   /// An Application of Fibonnaci series
		}
	}
}