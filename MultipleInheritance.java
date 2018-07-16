import java.util.*;
interface A{
	static public int a=0;
}
interface B{
	static public int b=0;
}

class C implements A,B{
	
	public void display(){
		System.out.println("A:"+a+" "+"B:"+b);
	}
}

class MultipleInheritance{
	public static void main(String args[]){
		C o= new C();
		//o.get(1,3);
		o.display();
	}
}