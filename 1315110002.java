import java.util.*;
import java.io.*;
class EvenOdd{
   int arr[]=new int[100];
	public void getInput(){
    	Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      //int arr[]=new int[a];
      for(int i=0;i<a;i++){
      	arr[i]=s.nextInt();
      }
    }
  
  public void findOddEven(){
  		int even[]=new int[100];
    int odd[]=new int[100];
    int k=0,l=0;
    for(int i=0;i<arr.length;i++){
    	if(arr[i]%2==0){
        	even[k]=arr[i];
          k++;
        }
      else{
      	odd[l]=arr[i];
        l++;
      }
    
    }
	System.out.print("Odd :");
    for(int i=0;odd[i]!=0;i++){
		System.out.print(odd[i]+" ");
	}
	System.out.println();
	System.out.print("Even :");
	for(int j=0;even[j]!=0;j++){
		System.out.print(even[j]+" ");
	}
  }
}
 class TestClass {
	 public static void main(String[] args) { 
		EvenOdd obj=new EvenOdd();
       obj.getInput();
       obj.findOddEven();
	}
}