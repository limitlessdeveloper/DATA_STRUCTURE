import java.util.*;
enum Rekhit{
	Srieesh,vats,saby;
}

class EnumOperation5{
	public static void main(String []args){
		Rekhit t[]=Rekhit.values();
		
		for(Rekhit r:t){
			System.out.println(r+" is at index "+r.ordinal());
		}
		System.out.println(Rekhit.valueOf("Srieesh"));
	}
}