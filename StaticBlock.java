import java.util.*;
class StaticBlock{
	static int a=10;
	static String s;
	StaticBlock(){
		a=100;
		s="Inside the Constructor";
	}
	
	static{															//static method doesn't need any object to call it, so it runs before the creation of the object for the respective class
		System.out.println("Inside the static block 1");
		a=5;
		s="Rekhit";
		System.out.println("a = "+a+" s = "+s);
	}
	static{
		System.out.println("Inside the static block 2");
		a=78;
		s="Gupta";
		System.out.println("a = "+a+" s = "+s);
	}
	public static void main(String args[]){
		StaticBlock ob=new StaticBlock();
		System.out.println(ob.a+" "+ob.s);
	}
}