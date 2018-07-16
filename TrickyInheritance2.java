import java.util.*;
class A{
	int i=10;
	public A(int j){
		System.out.println(i);
		this.i=j*10;
	}
}

class B extends A{
	B(int j){
		super(j);
		System.out.println(i);
		this.i=j*20;
	}
}
class TrickyInheritance2{
	public static void main(String args[]){
		B o=new B(20);
		System.out.println(o.i);
	}
}