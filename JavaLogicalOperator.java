import java.util.*;
class JavaLogicalOperator{
	public static void main(String []args){
		int a=6;
		int b=2;
		int c=a|b;
		if(true)System.out.println("or"+c);
		c=a&b;
		if(true)System.out.println("and"+c);
		c=a^b;
		if(true)System.out.println("xor"+c);
			
			
			//In Java if() or else or any conditional operator can only take boolean values
			//and |,& is a bitwise operator
			//and ||,&& are the logcial	 operator
	}
}