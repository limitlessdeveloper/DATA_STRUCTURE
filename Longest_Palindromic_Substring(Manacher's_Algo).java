import java.util.*;
class PalindromicSubstring{
	public static void main(String args[]){
		String s="abaxabaxabb";
		printLongestCommonSubString(s,s.length());
	}
	
	static void printLongestCommonSubString(String s,int length){
		int arr[]=new int[length];
		int i=0;
		while(i!=s.length()){
			arr[i]=printMaxLength(s,i);
			i++;
		} 
		int max=0,ind=0;
		for(int p=0;p<s.length();p++){   						//finding maximum Palindromic index and length
			if(max<arr[p]) {
				max=arr[p];
				ind=p;
			}
		}
		for(int im=0;im<s.length();im++){
			System.out.print(arr[im]+" ");
		}
		System.out.println();
		System.out.println(max+" "+ind);
	}


	static int printMaxLength(String s,int in){
		if(in==0||in==s.length()-1) return 1;
		if(s.charAt(in-1)!=s.charAt(in+1)){
			return 1;
		}
		int i=in-1;
		int j=in+1;
		int cnt=1;
		
		while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
			cnt=cnt+2;
			i=i-1;
			j=j+1;
		}
		return cnt;
	}
}