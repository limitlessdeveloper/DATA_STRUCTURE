import java.util.*;
import java.io.*;
class InputStreamFile{
	public static void main(String []args){
		FileInputStream f=null;
		try{
		 f=new FileInputStream("F:\\java programs\\default\\FileOperation\\rekhit.txt");
		int i=f.available(); 
		while(i>0)
		{
			System.out.print((char)f.read());
			i--;
		}
			f.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
			if(f!=null){
				f.close();
			}
				
			}
			catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}
}