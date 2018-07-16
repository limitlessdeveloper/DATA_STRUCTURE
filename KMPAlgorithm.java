import java.util.*;
class KMPAlgorithm{
	public static void main(String []args){
		String text="abxabcabcaby";
		String pattern="abcaby";
		printStringindex(text,pattern);
		
	}
	
	static void printStringindex(String text,String pattern){
		int arr[]=new int[pattern.length()];
		arr[0]=0;
		int k=1;
		int i=1,j=0;
		while( k!=pattern.length()-1){
			System.out.println("point here "+pattern.charAt(j)+" "+pattern.charAt(i));
			if(pattern.charAt(j)==pattern.charAt(i)){
				arr[k]=j+1;
				i=i+1;
				j=j+1;
				k++;
			}
			else{
				if(j>0){
					j=arr[j-1];
				}
				else{
					arr[k]=0;
					i++;
					k++;
				}
				
			}
		}
		
		for(int im=0;im<pattern.length();im++){
			System.out.print(arr[im]+" ");
		}
		
		checkStringExistorNot(text,pattern,arr);
	}
	
	static void checkStringExistorNot(String text,String pattern,int arr[]){
		int i=0;
		int j=0;
		int k=0;
		while(i!=text.length()&&j!=pattern.length()){
			if(text.charAt(i)==pattern.charAt(j)){
				if(j==pattern.length()-1){
					System.out.println("yes String exist at index "+(i-(pattern.length()-1)));
					}
				i++;
				j++;
			}
			else{
				if(j>0){
					j=arr[j-1];
				}
				else{
					i++;
				}
			}
		}
	}
}