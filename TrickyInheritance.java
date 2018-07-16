import java.util.*;

class A{
	A(int a){
		System.out.println("a");
	}
}
class B extends A{
	B(int a){
		super(a);
		System.out.println("b");
	}
}
class C extends B{
	C(int a){
		super(a);
		System.out.println("c");
	}
}

class TrickyInheritance{
	public static void main(String args[]){
		System.out.println("On creating class C object");
		C o=new C(5);
		System.out.println("On creating class B object");
		B ob=new B(12);
		System.out.println("On creating class A object");
		A obj=new A(10);
	}
}