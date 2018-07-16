import java.util.*;
class TestClass{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			if(i%2==0){
				for(int j=0;j<a;j++){
					if(j%2==0)System.out.print("1 ");
					else System.out.print("0 ");
				}
			}
			else{
				for(int j=0;j<a;j++){
					if(j%2==0)System.out.print("0 ");
					else System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
		
	}
}