import java.util.*;
class MonkeyClimbing{
	public static void main(String []args){
		int i=0;
		System.out.println("the number of ways the monkey can climb 5 stairs is " + countWays(5,i));
	}
	
	static int countWays(int a,int i){
		if(i>a)return 0;
		else if(i==a) return 1;
		else return(countWays(a,i+1) + countWays(a,i+2)); 
	}
}