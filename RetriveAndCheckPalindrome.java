import java.util.*;
import java.io.*;
public class RetriveAndCheckPalindrome{
	public static void main(String args[]){
		System.out.println("From buffered reader");
		File f=new File("F:\\java programs\\default\\FileOperation\\saby.txt");
		BufferedReader br=null;
		int cnt=0;
	try{	
		 br=new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null){
			int flag=0;
			for(int i=0;i<=st.length()/2;i++){
				if(st.charAt(i)==st.charAt(st.length()-1-i)){
					flag=1;
					continue;
					}
				else{
					flag=-1;
					break;
					}
			}
			if(flag==1) cnt++;
		}
		System.out.println("palindrome: "+cnt);
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