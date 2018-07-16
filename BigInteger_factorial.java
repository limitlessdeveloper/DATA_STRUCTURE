import java.util.*;
import java.math.BigInteger;
import java.lang.*;
class Sample{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=Integer.parseInt(s.next());
		BigInteger b=factorial(a);
		System.out.println(b);
	}
	
	static BigInteger factorial(int a){
		if(a==1 || a==0){
			return (BigInteger.valueOf(1));
		}
		else{
			BigInteger b=new BigInteger("1");
			for(int i=2;i<=a;i++){
				b=b.multiply(BigInteger.valueOf(i));
			}
			return b;
		}
	}
}