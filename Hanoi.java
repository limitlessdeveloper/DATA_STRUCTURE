import java.lang.*;
import java.util.*;
/**Represents the class of Hanoi Programs*/
public class Hanoi{
	/** Returns the result for the given*/
		static void Hanoi(int n,String A,String B,String C){
			if(n==1)
				System.out.println(A+"->"+C);
			else{
				Hanoi(n-1,A,C,B);
				System.out.println(A+"->"+C);
				Hanoi(n-1,B,A,C);
				
			}
		}
	
		public static void main(String [] args ) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Number of Disk: ");
			int n= s.nextInt();
			Hanoi(n,"A","B","C");
		
		
		}
}