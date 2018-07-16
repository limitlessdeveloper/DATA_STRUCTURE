import java.lang.*;
import java.util.*;
public class RotateArray{
		static void display(int a[][]){
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();
			}
		}
		public static void main(String [] args){
			int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			display(a);
			System.out.println();
			System.out.println();
			System.out.println();
			displayR(a);
			System.out.println();
			System.out.println();
			System.out.println();
			displayL(a);
		}
		static void displayR(int a[][]){
			for(int i=0;i<a.length;i++){
				for(int j=a.length-1;j>=0;j--){
					System.out.print(a[j][i]+"  ");
				}
				System.out.println();
			}
		}
		static void displayL(int a[][]){
			for(int i=a.length-1;i>=0;i--){
				for(int j=0;j<a.length;j++){
					System.out.print(a[j][i]+"  ");
				}
				System.out.println();
			}
		}
		
}