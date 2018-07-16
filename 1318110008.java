import java.io.*;
import java.util.*;
class Student{
	private int rollno;
	private String name=new String();
  
  public void getRollNo(){
  	Scanner s=new Scanner(System.in);
    name=s.nextLine();
    rollno=s.nextInt();
  }
  
  public void putRollNo(){
  	System.out.println("Name="+name+"\n"+"Regno="+rollno);
  }
}
class Marks extends Student{
	protected int m1;
  protected int m2;
  protected int m3;
  
  public void getMarks(){
  	Scanner s=new Scanner(System.in);
    m1=s.nextInt();
    m2=s.nextInt();
    m3=s.nextInt();
  }
  
  public void putMarks(){
  System.out.println("Mark1="+m1+"\n"+"Mark2="+m2+"\n"+"Mark3="+m3);
  }
  
}

class Result extends Marks{
	private float total;
  
  public void computeDisplay(){
  	total=m1+m2+m3;
    System.out.println("Total="+total);
  }
}
 class TestClass {
	 public static void main(String[] args) { 
		Result r=new Result();
       r.getRollNo();
       r.getMarks();/* getRollNo(), getMarks(), putRollNo(), putMarks() and computeDisplay()*/
     	r.putRollNo();
       r.putMarks();
       r.computeDisplay();
	}
}