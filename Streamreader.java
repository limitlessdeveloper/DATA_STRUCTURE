import java.util.*;
import java.lang.*;
import java.io.*;
///read and write the program by using file reader and file writer!
class Streamreader
{
	public static void main(String []args)throws IOException
	{
		String s="ASDFGHJKL";
		int t=65;
		FileWriter f=new FileWriter("F:\\java programs\\filesoperation\\java.txt");
		f.write(s);
		f.write(t);
		f.flush();
		f.close();
		FileReader fr= new FileReader("F:\\java programs\\filesoperation\\java.txt");
		int n;
		while((n=fr.read())!=-1)
		System.out.print((char)n);
	}
}