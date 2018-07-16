class Bitwise{
	public static void main(String []args){
		int a=7;
		int b=15;
		int c=0;
		c = a & b;
		System.out.println("bitwise and :"+ c );
	    c = a | b;
		System.out.println("bitwise or :"+c);
		c = a ^ b;
	    System.out.println("bitwise xor :"+c);
		c = ~b;
	    System.out.println("bitwise not(b) :"+c);
		c=~a;
	    System.out.println("bitwise not(a) :"+c);
		c=a >> 1;
	    System.out.println("bitwise right(a) Shift :"+c);
		c=b >> 1;
	    System.out.println("bitwise right(b) Shift :"+c);
	    c=a << 1;
		System.out.println("bitwise left(a) Shift :"+c);
   	    c=b << 1;
		System.out.println("bitwise left(b) Shift :"+c);
		c=b >>> 0;
	    System.out.println("bitwise shift right Zero fill (b) :"+c);
		c=a >>> 0;
		System.out.println("bitwise shift right Zero fill (a) :"+c);	
	}
}