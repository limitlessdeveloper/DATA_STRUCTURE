import java.util.*;
class MinimumDistance{
	public static void main(String []args){
		String s1="abcdef";
		String s2="azced";
		printMinimumEdit(s1,s2,s1.length(),s2.length());
	}
	
	static void printMinimumEdit(String s1,String s2,int l1,int l2){
		
		int arr[][]=new int[l2+1][l1+1];
		for(int i=0;i<=l1;i++){
			arr[0][i]=i;
		}
		for(int i=0;i<=l2;i++){
			arr[i][0]=i;
		}
		
		for(int i=1;i<=l2;i++){
			for(int j=1;j<=l1;j++){
				if(s2.charAt(i-1)==s1.charAt(j-1)){            		//********
					arr[i][j]=arr[i-1][j-1];						//********
				}
				else{
					arr[i][j]=min(arr[i-1][j-1],arr[i-1][j],arr[i][j-1])+1;
				}
			}
		}
		
		for(int i=0;i<=l2;i++){
			for(int j=0;j<=l1;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		printChanges(arr,l2,l1,s1,s2);	
		//left ----deleted character
		//upper-----inserted character
		//diognal----- 
	}
	
	static void printChanges(int arr[][],int row,int col, String s1,String s2){
		
		int cnt=0;
		while(row!=0&& col!=0){
			//System.out.println("point here "+s2.charAt(row-1)+" "+s1.charAt(col-1)+" "+arr[row][col]+" "+arr[row-1][col-1]);
			if(s2.charAt(row-1)!=s1.charAt(col-1)){
				
				if(arr[row][col]==arr[row-1][col-1]+1){
					cnt++;
					System.out.println("character "+s1.charAt(col-1)+" is replaced by "+s2.charAt(row-1));
					row=row-1;
					col=col-1;
				}
				else if(arr[row][col]==arr[row][col-1]+1){
					cnt++;
					System.out.println("character "+s1.charAt(col-1)+" is deleted ");
					col=col-1;
				}
				else{
					cnt++;
					System.out.println("character "+s2.charAt(row-1)+" is inserted ");
					row=row-1;
				}
			}
			else{
				row=row-1;
				col=col-1;
			}
		}
		System.out.println("minimum edit distance = "+cnt);
	}
	
	static int min(int a,int b,int c){
		if(a<b){
			if(a<c) return a;
			else return c;
		}
		else{
			if(b<c)return b;
			else return c;
		}
	}
}