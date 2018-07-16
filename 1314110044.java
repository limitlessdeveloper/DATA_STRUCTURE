import java.util.*;
class TestClass{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++){
			System.out.print("Row "+i+": ");
				for(int j=1;j<=a;j++){
					
					System.out.print((i*j)+" ");
				}
				System.out.println();
			
		}
	}
	
}