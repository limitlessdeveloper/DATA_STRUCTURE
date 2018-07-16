import java.util.*;
import java.io.*;
class Permutation{
	static int cnt=0;
	public static void main(String []args){
		//Permutation obj=new Permutation();
		BufferedReader br=null;
			try{
				br=new BufferedReader(new FileReader("F:\\java programs\\default\\FileOperation\\rekhit.txt"));
				String g;
				while((g=br.readLine())!=null){
				char arr[]=g.toCharArray(); 				
				printPermutation(arr,0,arr.length-1);
				}
				
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
	
	static void printPermutation(char []arr,int s_length,int ar_length){
		if(s_length==ar_length){
			System.out.println(Arrays.toString(arr));
			cnt++;
		}
		else{
			for(int i=s_length;i<=ar_length;i++){
				swap(s_length,i,arr);
				printPermutation(arr,s_length+1,ar_length);
				swap(s_length,i,arr);// backtracking
			}
		}
	}
	
	static void swap(int a,int b,char arr[]){
		char temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}