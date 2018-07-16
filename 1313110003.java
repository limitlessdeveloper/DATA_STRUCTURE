import java.io.*;
import java.util.*;
 class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       Double a=s.nextDouble();
       Double b=s.nextDouble();
       Double d=a/b;
       System.out.println(String.format("%.02f",d*(9.76460174)));
	}
}