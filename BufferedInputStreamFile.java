import java.util.*;
import java.io.*;
class BufferedInputStreamFile{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		FileInputStream f=null; 
		BufferedInputStream br=null;
		try{
			f=new FileInputStream("F:\\java programs\\default\\FileOperation\\bufferedoutputstream.txt");
			br=new BufferedInputStream(f);
			int i=br.available();
			while(i>0){
				System.out.print((char)br.read());
				i--;
			}
			f.close();
			br.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	finally{
		try{
			if(br!=null){
				br.close();
			}
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