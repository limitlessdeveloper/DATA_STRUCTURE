import java.util.*;
import java.util.ArrayList;
import java.io.*;
public class PrintLexiCographicSequence{
	public static void main(String args[]){
		System.out.println("From buffered reader");
		File f=new File("F:\\java programs\\default\\FileOperation\\saby.txt");
		BufferedReader br=null;
		int cnt=0;
		ArrayList<String> list=new ArrayList<>();
	try{	
		br=new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null){
				list.add(st);
			}
		Collections.sort(list);
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i));
		}
		
		br.close();
		
	}
	catch(IOException e){
				System.out.println(e.toString());
	}
	finally{
		try{
			if(br!=null) br.close();
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
	}
}		