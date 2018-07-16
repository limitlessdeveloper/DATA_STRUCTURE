import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		
		super(s);
	}
	
}
class Sample{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		try{
			if(age<19) throw new InvalidAgeException("not valid");
			else{
				
				System.out.println("welcome to vote");
			}
			
		}
		catch(InvalidAgeException e){
			System.out.print("Exceptin: "+e);
		
		}
	}
}