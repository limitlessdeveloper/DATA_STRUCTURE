import java.util.*;
import java.io.*;
class BufferedOutputStreamFile{
 public static void main(String []args){
	 Scanner s=new Scanner(System.in);
	 String s1=s.nextLine();
	 FileOutputStream f=null;
	 BufferedOutputStream bw=null;
	 try{
		 f=new FileOutputStream("F:\\java programs\\default\\FileOperation\\bufferedoutputstream.txt");
		 bw=new BufferedOutputStream(f);
		 int i=0;
		 while(i<s1.length()){
			 bw.write(s1.charAt(i));
			 i++;
		 }
		 bw.flush();
		 bw.close();
		 f.flush();
		 f.close();
	 }
	 catch(IOException e){
		 System.out.println(e.toString());
	 }
	 finally{
		 try{
			 if(bw!=null){
				 bw.flush();
				 bw.close();
			 }
			 if(f!=null){
				 f.flush();
				 f.close();
			 }
		 }
		 catch(IOException e){
			 System.out.println(e.toString());
		 }
	 }
 }
}