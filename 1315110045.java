import java.io.*;
import java.util.*;
class Dob{
  int date;
  int month;
  int year;
	void read(){
    	Scanner r=new Scanner(System.in);
      	date=r.nextInt();
      month=r.nextInt();
      year=r.nextInt();
    }
	void disp(){
    	System.out.println(date+" "+month+" "+year);
    }
}
 class TestClass {
	 public static void main(String[] args) { 
		Dob s=new Dob();
       s.read();
       s.disp();
	}
}