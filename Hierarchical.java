import java.util.*;
class A{
	void display(int a){
		System.out.println("From parent class A :"+a);
	}
}

class B extends A{
	void display(int b){
		System.out.println("Form child class B :"+b);
		super.display(b);
	}
	 static void disp(int d){
		System.out.println("from the child B method display: "+d);
	}
} 

class C extends B{
	void display(int c){
		System.out.println("From child class C :"+c);
	}
	static void disp(int v){
		// super.display(v);
		// super.disp(v);
		// display(v);
	}
}

class Hierarchical{
	public static void main(String args[]){
		 B o=new C(); 		// **** from this only those method will run which are overrided from the parent A class. 
		 o.disp(5);
	}
}