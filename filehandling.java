import java.util.*;
import java.lang.*;
import java.io.*;
class filehandling
{
	public static void main(String args[])throws IOException
	{
		String s="Dfsdghjasdfghjkhj";
		int t=65;
		FileWriter f=new FileWriter("F:\\java programs\\filesoperation\\rek.txt");
		f.write(s);
		f.write('\n');
		f.write(t);
		f.flush();
		f.close();
		FileReader w=new FileReader("F:\\java programs\\filesoperation\\rek.txt");
		int n;
	//	char fa[]=new char[100];
		// fa;
		while((n=w.read())!=-1)
		System.out.print((char)n);	
		//w.read(fa);
		//for(char r:fa)System.out.print(r);
		//w.close();
	}
}