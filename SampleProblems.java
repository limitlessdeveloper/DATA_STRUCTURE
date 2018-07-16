import java.util.*;
class SampleProblem{
	public static void main(String []args){
		int a[][]=new int[5][5];
		int l=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				a[i][j]=++l;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(a[i][j]+" ");
			}
			if(i+1<5){
				i++;
				for(int j=0;j<5;j++){
					System.out.print(a[i][4-j]+" ");
				}
			}
		}
	}
}

