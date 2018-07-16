import java.util.*;
import java.lang.*;
class WordBreak{
	public static void main(String []args){
		String s="mobilemango";
		String arr[]={"i","like","sam","sung","samsung","mobile","ice","cream","icecrream","man","go","mango"};
		System.out.println(checkString(arr,s)?"YES":"NO");
	}
	
	
	static boolean checkString(String[] arr,String s){
		int t=s.length();
		for(int i=0;i<t;i++){
			if(checkString(arr,s.substring(0,i)) &&  checkString(arr,s.substring(i,t))){
				return true;
			}
		}
		
		if(checkStringWithArray(arr,s))return true;
		else return false;
	}
	
	static boolean checkStringWithArray(String[] arr,String s){		
		int t=arr.length;
		for(int i=0;i<t;i++){
			if(arr[i].equals(s)){
				return true;
			}
		}
		return false;
	}
}