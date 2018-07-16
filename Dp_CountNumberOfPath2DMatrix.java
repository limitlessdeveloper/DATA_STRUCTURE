import java.util.*;
class Matrix{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println(countPath(3,3));
	}
	
	
	static int countPath(int a,int b){
		
		if(a==1 || b==1)return 1;
		else{
			return(countPath(a-1,b) + countPath(a,b-1));
		}
	}
}