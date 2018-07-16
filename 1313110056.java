import java.util.*;
class TestClass{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			for(int j=1;j<=a-i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=a;i>0;i--){
			for(int j=1;j<a-i+2;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}