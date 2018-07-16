import java.util.*;

class MyException extends Exception{
	
	MyException(String s){
		super(s);
	}
}

class Sample{
	
	
	public static void main(String args[]){
		
		try{
			
			throw new MyException("message");
		}
		catch(MyException e){
			System.out.print("Exception:");
			System.out.println(e.getMessage());
		}
		
	}
	
}