import java.util.*;
import java.io.*;
class dataopstream
{
	public static void main(String args[])throws IOException
	{
		int v[]={71,72,73,74,75,76};
		FileOutputStream f=new FileOutputStream("F:\\java programs\\filesoperation\\dataopstream.txt");
		for(int a:v)
		f.write(a);
	}
}