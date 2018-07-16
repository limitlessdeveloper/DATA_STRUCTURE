import java.util.*;
 
 class TestClass{
 
 public static void main(String[] args) {
   
  	Scanner s=new Scanner(System.in);
   int t=s.nextInt();
   String str[]=new String[t]; 
   for(int i=0;i<t;i++){
 	 str[i] = s.next();
   }
   String chr=s.next();
   for(int i=0;i<t;i++){
	 int charCount = str[i].length() - str[i].replaceAll(chr, "").length();
 	System.out.println(chr+"="+charCount);
	}
}
 }
