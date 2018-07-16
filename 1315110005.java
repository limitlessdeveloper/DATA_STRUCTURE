import java.util.*;
import java.io.*;
 class TestClass {
	String s1=new String();
  String s2=new String();
  String s3=new String();
	TestClass(String s1,String s2,String s3){
    	this.s1=s1;
      this.s2=s2;
      this.s3=s3;
    } 
  void show(){
  	System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
  public static void main(String[] args) { 
    Scanner s=new Scanner(System.in);
    String s1=new String();
    String s2=new String();
    String s3=new String();
     s1=s.nextLine();
     s2=s.nextLine();
     s3=s.nextLine();
	 TestClass tc=new TestClass(s1,s2,s3);
    tc.show();
	}
}