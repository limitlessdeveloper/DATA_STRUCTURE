import java.util.*;
import java.io.*;

public class FileReaderAndFileWriter{
	public static void main(String args[]){
			
			String s1=new String();
			Scanner s=new Scanner(System.in);
			s1=s.nextLine();
		FileWriter fw=null;
		try{	
			 fw=new FileWriter("F:\\java programs\\default\\FileOperation\\rek.txt");
			fw.write(s1);
			fw.flush();
			fw.close();
			System.out.println("File written successfully");
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		finally{
			try{
			if(fw!=null) fw.close();
			}
			catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}
	
	
}