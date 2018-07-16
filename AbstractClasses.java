import java.util.*;
abstract class AbstractClasses{
	int a;
	abstract void display();
}
class A extends AbstractClasses{
	void display(){
		super.a=10;
		System.out.println("A: "+a);
	}
}

class Sample{
	public static void main(String args[]){
		//AbstractClasses o=new AbstractClasses();				//Abstract classes cannot be initiated 
		A o=new A();;											//not necessary to give abstract method inside the abstract class
		o.display();											//Abstract method is must not have defination in an abstract class
	}
}