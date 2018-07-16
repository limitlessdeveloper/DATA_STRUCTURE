import java.util.*;
class A
{
	 static  void  fun()
	  {
		  System.out.println("Rekhit");
	  }
}

class B extends A{
	
	static  void fun()
	 {
		 System.out.println("krishna");
	 }
	  
}

class test54{
	public static void main(String args[]){
		B o=new B();
		o.fun();
		A o1=new B();
		o1.fun();
	}
}