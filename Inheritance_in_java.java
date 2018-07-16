import java.util.*;
class A{
	int a;
	void fun(int x){
		this.a=x;
	}
}


class Sample{
	public static void main(String args[]){
		A o=new A();
		o.a=10;
		o.fun(5);
		A f=new A();
		System.out.println(o.a+" "+f.a);
	}
}