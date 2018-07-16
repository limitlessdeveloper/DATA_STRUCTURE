import java.util.*;
class A{
	public char type='b';
	A(){
		System.out.println("Class Alpha");
	}
}
class B extends A{
	B(){
		type='a';
		System.out.println("Class Beta");
	}
	void fun(){
		System.out.println(this.type+" "+super.type);
	}
}

class TrickyInheritance3{
	public static void main(String args[]){
		new B().fun();
	}
}