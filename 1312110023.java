import java.util.*;
import java.io.*;
 class TestClass {
	
  static protected int v;
  public static void main(String[] args) { 
	Scanner s=new Scanner(System.in);	
    TestClass ob=new TestClass();
    ob.v=s.nextInt();
	System.out.println(fun());
  }
  
  static int fun(){
  	return(++v);
  }
}