import java.util.*;
import java.lang.*;
class Sample{
 public static void main(String [] args) 
    {	
		int arr[]={1,13,45,1,587,65112,487,8,61,2};
		String st_arr[]=new String[arr.length];
		for(int i=0;i<arr.length;i++){
			st_arr[i]=String.valueOf(arr[i]);
		}
		Arrays.sort(st_arr,new Comparator<String>(){
			public int compare(String a,String b){
				return (b+a).compareTo(a+b);
			}
		});
		StringBuilder sb=new StringBuilder();
		for(String s:st_arr){
			sb.append(s);
		}
		if(sb.charAt(0)=='0' && sb.length()>1) sb.deleteCharAt(0);
		System.out.println(sb.toString());
    }											   
}