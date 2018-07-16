;import java.util.*;
import java.io.*;
class Sample{
  int year;
 public void getInput(){
 	Scanner s=new Scanner(System.in);
    year=s.nextInt();
   centuryFromYear(year);
 }
static void centuryFromYear( int year){
	int a,b,c=year;
 	a=year%10;
  	year/=10;
  	b=year%10;
  	year/=10;
  	if(a==0&&b==0){
    	System.out.println(year);
    }
  else{
  	System.out.println(year+1);
  }
}
}
class TestClass {
	 public static void main(String[] args) { 
		Sample objname=new Sample();
       objname.getInput();
	}
}