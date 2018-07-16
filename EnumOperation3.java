import java.util.*;
class EnumOperation3{
	enum Day{
		MONDAY,TUESDAY,WEDNESDAY;
	}
	public static Day day;
	public EnumOperation3(Day day){
		this.day=day;
	}
	public void dayIsLike(){
		switch(day){
			case MONDAY:System.out.println("monday is sunny");
						break;
			case TUESDAY:System.out.println("tuesday is bad");
						break;
			case WEDNESDAY:System.out.println("wednesday is pleasent");
							break;
		}
	}
	
	public static void main(String args[]){
		String str="TUESDAY";
		EnumOperation3 o=new EnumOperation3(Day.valueOf(str));					// it will convert the string value into the enum form
		o.dayIsLike();
	}
}