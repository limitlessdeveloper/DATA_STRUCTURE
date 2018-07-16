import java.util.*;
class SpecificMethodCalling{
	static void fun(String s){
		System.out.println("From the String constructor");
	}
	static void fun(Object o){
		System.out.println("From the class constructor");
	}
	
	/*static void fun(Integer s){
		System.out.println("from the integer class method");			//Now if we call the fun then it will not able to decide between String and integer 
	}*/																	//both are having the same specific nature 
	
	public static void main(String args[]){
			SpecificMethodCalling t=new SpecificMethodCalling();
			fun(null);     								//It will call fun of String parameter because It is more specific over object method.
	}
}