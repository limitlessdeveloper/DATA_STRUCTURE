import java.util.*;
enum Rekhit{						
	saby,vats,srieesh;							// all constants of enums are "public static final" access
	
	private Rekhit(){
		System.out.println("Inside enum constructor "+this.toString());
	}
	
	public void display(){
		System.out.println("roomie 2k18");
	}
}

//enum constructor will calls automatically whenever there is some executable commands related to enum like(line no 18) is there.
// and its constructor will calls for as many times as it is having constants number(number of constants).
class EnumOperation6{
	public static void main(String []args){ 
		Rekhit r=Rekhit.saby;
		System.out.println(Rekhit.valueOf("vats"));
		System.out.println(r);
		r.display();
	}
}