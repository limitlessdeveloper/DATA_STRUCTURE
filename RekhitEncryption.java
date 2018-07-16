import java.util.*;
import java.io.*;
public class RekhitEncryption{
	public static void main(String args[]) throws IOException{
		File f=new File("F:\\java programs\\default\\FileOperation\\rek.txt");
		File g=new File("F:\\java programs\\default\\FileOperation\\rekhit.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		BufferedWriter bw=new BufferedWriter(new FileWriter(g));
		String st;
		while((st=br.readLine())!=null){
			int i=0,n;
			//String h;
			while(i<st.length()){
				n=(int)st.charAt(i);
				bw.write((char)n+3);
				i++;
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();	
	}
}
