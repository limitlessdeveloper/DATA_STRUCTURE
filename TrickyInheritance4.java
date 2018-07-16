import java.util.*;

class A{
	A(){
		System.out.println("class A");
	}
	public static A a=new A();
	public static void main(String args[]){
		A o=new A();
	}
}