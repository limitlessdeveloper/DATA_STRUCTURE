import java.util.*;
import java.io.*;
public class ReadingFromFile{
	public static void main(String args[]){
		System.out.println("From buffered reader");
		File f=new File("F:\\java programs\\default\\FileOperation\\saby.txt");
		BufferedReader br=null;
		FileReader fr=null;
	try{	
		 br=new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null){
			System.out.println(st);
		}
		
		br.close();
		System.out.println("\nBy File reader\n");
		fr=new FileReader(f);
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		
		fr.close();
		System.out.println("\nBy Scanner class\n");
		Scanner s=new Scanner(f);
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
	}
	catch(IOException e){
				System.out.println(e.toString());
	}
	finally{
		try{
			if(br!=null) br.close();
			if(fr!=null) fr.close();
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
	}
}