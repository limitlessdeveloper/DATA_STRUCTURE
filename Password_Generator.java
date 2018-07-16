import java.util.*;
class GeneratePassword{
	public static void main(String []args){
		char arr[]={'a','b','c'};
		genratePass(arr,arr.length);
	}
	
	static void genratePass(char arr[],int len){
		for(int i=1;i<=len;i++){
			printCombination(arr,i,"",len);
		}
	}
	
	static void printCombination(char []arr,int i,String s,int len){
		if(i==0){
			System.out.println(s);
			return;
		}
		else{
			for(int j=0;j<len;j++){
				String append=s+arr[j];
				printCombination(arr,i-1,append,len);
			}
		}
	}
}