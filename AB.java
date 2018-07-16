import java.util.*;
class sample{
static int a=20;
public static void main(String args[]){
	System.out.println(a);
	int a=10;									
	System.out.println(a);
	{
	int a=40;									//it will shows an error because it si declearing again 
	System.out.println(a);
	}
	System.out.println(a);
	call();
	}
	public static void call(){
		System.out.println(a);
	}
}