import java.io.*;
import java.util.*;
interface Area{
	static float pi=3.14f;
  public float compute(float x,float y);
}

class Rectangle implements Area{
	@Override
public 	float compute(float x,float y){
    	return(x*y);
    }
}
  class Circle implements Area{
	  @Override
  	 public float compute(float x,float y){
    	return(pi*x*y);
    }
  }
	

 class TestClass {
	 public static void main(String[] args) { 
		Rectangle rect=new Rectangle();
       Circle cir=new Circle();
       Area area;
       area=rect;
       Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Area of Rectangle = "+area.compute(a,b));
		area=cir;
		System.out.println("Area of Circle = "+area.compute(a,b));
	}
}