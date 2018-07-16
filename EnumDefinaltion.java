import java.util.*;

enum Rek{
		sun,
		mon,tues,wed,thrus,fri,sat;
}
class EnumDefination{
	
	public static void main(String []args){
		Rek no[]=Rek.values();
		System.out.println(no[1].ordinal());
	}
}