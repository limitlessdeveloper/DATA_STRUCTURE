import java.util.*;
import java.lang.*;
class Sample{
	public static void main(String args[]){
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		(new Sample()).printf();
	}
	void printf(){
		
		System.out.println("printing without object");
		
	}
}