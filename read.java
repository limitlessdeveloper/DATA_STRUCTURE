import java.util.*;
import java.lang.*;
import java.io.*;
class read
{
	public static void main(String []args)throws IOException
	{
		String s="adfghhj";
		FileReader f=new FileReader("F:\\java programs\\filesoperation\\rek.txt");
		int t;
		while((t=f.read())!=-1)
			System.out.println((char)t);
		
	}
}