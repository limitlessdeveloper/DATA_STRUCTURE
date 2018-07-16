import java.util.*;
class A{
	static void display(){
		System.out.println("From parent class A Sorry can't display ur pics");
	}
	void get(){
		System.out.println("From parent class A get method :lick and suck");
	}
}
class B extends A{
	
static void display(){
		System.out.println("From child class B");
	}
	void call(){
		super.display();    // will call the Parent class methods.
		this.display(); //will call the child class methods.
	}
}

class SuperMethodImplementation{
	public static void main(String args[]){
		B o=new B();		
		//A o=new B();
		o.call(); 
	}
}