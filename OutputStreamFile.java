import java.util.*;
import java.io.*;
class OutputStreamFile{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
	FileOutputStream fo=null;
	try{
		fo=new FileOutputStream("F:\\java programs\\default\\FileOperation\\outputstream.txt");
		int i=0;
		while(i<s1.length()){
		fo.write(s1.charAt(i));
		i++;
		}
		System.out.println("File Writing is over");
		fo.flush();
		fo.close();
	}
	catch(IOException e){
		System.out.println(e.toString());
	}
	finally{
		try{
			if(fo!=null) fo.flush();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	}
}