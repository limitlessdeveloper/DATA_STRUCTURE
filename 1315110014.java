import java.util.*;
import java.io.*;
class Average{
  	int s1;
	float av;
	public void computeAvg(){
		Scanner s=new Scanner(System.in);
	  float sum=0; 
      int a=s.nextInt();
      int arr[]=new int[a];
       for(int i=0;i<a;i++){
       		arr[i]=s.nextInt();
         	sum+=arr[i];
       	}
		s1=(int)sum;
		av=sum/a;
	}
	public float postAvg(){
		return av;
	}
	public int postSum(){
		return s1;
	}
}
 class TestClass {
	 public static void main(String[] args) { 
       Average obj=new Average();
       obj.computeAvg();
	   System.out.println(obj.postSum());
	   System.out.println(String.format("%.02f",obj.postAvg()));
	}
}