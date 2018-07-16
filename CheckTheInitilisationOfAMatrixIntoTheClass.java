import java.util.*;
class Test{
	int a[]=new int[100];
	Test(int data){
	int a[]=new int[data];
	}
	
	void printm(){
		int i=0;
		for( i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println(i);
	}
	public static void main(String []args){
		Test obj=new Test(5);
		obj.printm();
	}
}