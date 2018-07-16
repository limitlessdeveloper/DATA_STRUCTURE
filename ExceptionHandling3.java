import java.util.*;
class Sample{
		
	static	void fun(){
			
			try{
				throw new NullPointerException("inside the fun");
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
				throw new NullPointerException("inside the main");
			}
		}
		public static void main(String args[]){
			try{
				
				fun();
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
			}
			
		}
	
}