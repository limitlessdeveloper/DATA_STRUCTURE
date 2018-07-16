import java.util.*;
class Sample{
	public static void main(String args[]){
		
		int a[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
			for(int i=0;i<3;i++){
				int x=i;
				for(int j=0;j<3&&x<3;j++,x++){
					System.out.print(a[x][j]);
				}
				System.out.println();
					
			}
				System.out.println();
			
			for(int i=0;i<3;i++){
				int x=i;
				for(int j=0;j<3&&x>=0;j++,x--){
					System.out.print(a[x][j]);
				}
				System.out.println();
			}
				System.out.println();
			
			for(int i=2;i>=0;i--){
				int x=i;
				for(int j=0;j<3&&x>=0;j++,x--){
					System.out.print(a[x][j]);
				}
				System.out.println();
					
			}
				System.out.println();
			
			for(int i=0;i<3;i++){
				
				int x=0;
				for(int j=i;j<3&&x<3;x++,j++){
					System.out.print(a[x][j]);
				}
				System.out.println();
			}
				System.out.println();
			
			for(int i=0;i<3;i++){
				int x=0;
				for(int j=2-i;j<3&&x<3;j++,x++){
					System.out.print(a[x][j]);
				}
				System.out.println();
			}
	
	}
}