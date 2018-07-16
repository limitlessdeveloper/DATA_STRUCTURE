import java.util.*;
import java.lang.*;

class TestClass{
		public static void main(String []args){
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			for(int i=1;i<=a;i++){
				if(i%2!=0){
					for(int j=1;j<=i;j++){
							if(j%2!=0){
								System.out.print("0 ");
							}
							else{
								System.out.print("1 ");
							}
					}
				}
				if(i%2==0){
					for(int j=1;j<=i;j++){
							if(j%2!=0){
								System.out.print("1 ");
							}
							else{
								System.out.print("0 ");
							}
					}
				}
				System.out.println();
				
			}
		}
}