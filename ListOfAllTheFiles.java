import java.util.*;
import java.lang.Exception.*;
import java.io.File;
class Sample{
	public static void main(String args[]){
		System.out.println("List of all the files:");
		try{
			File f=new File("F:\\java programs\\default");
			System.out.println("With there path");
			 for(File s:f.listFiles()){
				 System.out.println(s.toString());
			 }
			System.out.println("\nWith there name");
				for(String s:f.list()){
					System.out.println(s);
				}				
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		
	}
}