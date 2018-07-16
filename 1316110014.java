import java.io.*;
import java.util.*;
class Sample{
  int a;
	void getInput(){
    	Scanner s=new Scanner(System.in);
      	 a=s.nextInt();
		 
    }
  void displayFib(){
  	for(int i=0;i<a;i++){
    	System.out.print(printFib(i)+" ");
    }
    System.out.println();
  }
  
	int printFib(int i){
  	if(i==0 || i==1){
    	return 1;
    }
      else return(printFib(i-1)+printFib(i-2));
  }
  
  /*void loop(int l){
  	int a=0,b=1,c;
    	for(int i=0;i<l;i++){
        	System.out.print(a+" ");
          c=a+b;
          a=b;
          b=c;
        }
  }*/
}
 class TestClass {
	 public static void main(String[] args) { 
			Sample s=new Sample();
			s.getInput();
			s.displayFib();
	}
}