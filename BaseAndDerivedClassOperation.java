import java.util.*;
class A{
	static void staticfun(){
		System.out.println("from class A static function");
	}
	void display(){
		System.out.println("from A normal function display");
	}
}

class B extends A{
	static void staticfun(){
		System.out.println("From derived class B  static function");
	}
	void display(){
		System.out.println("frm derived class normal function");
	}
}

class BaseAndDerivedClassOperation{
	public static void main(String args[]){
		B ob=new B();       //calls both the B(derived) class function @override
		ob.display();
		ob.staticfun();
		A obj=new B();		// calls static function of Parent class and normal function of derived class 
		obj.display();
		obj.staticfun();
	}
}
