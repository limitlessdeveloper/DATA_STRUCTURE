import java.util.*;
import java.io.*;
class Bstream
{
	public static void main(String []args)throws IOException
	{
	FileInputStream f=new FileInputStream("F:\\java programs\\filesoperation\\rek.txt");
	FileInputStream g=new FileInputStream("F:\\java programs\\filesoperation\\java.txt");
	FileOutputStream o=new FileOutputStream("F:\\java programs\\filesoperation\\java.txt");
	int n,r;
	while((n=f.read())!=-1)
	{o.write((byte)n);}
	byte a[]=new byte[100];
	while((r=g.read())!=-1)
		g.read(a);
//		System.out.println((int)n);
	for(byte b:a)System.out.print((char)b);
	}
	
}