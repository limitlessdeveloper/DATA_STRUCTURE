import java.util.*;
import java.lang.*;

class Squar{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int r=0;r<t;r++){
			int n=s.nextInt();
			int mat[][]=new int[n][2];
			for(int i=0;i<n;i++){
				for(int j=0;j<2;j++){
					mat[i][j]=s.nextInt();
				}
			}
			calculateSquar(mat,n);
		}
	}
	
	static void calculateSquar(int [][]mat,int n){
		int cnt=0;
		for(int i=0;i<n;i++){
			int x=mat[i][0];
			int y=mat[i][1];
			cnt=cnt+formingSquar(x,y,i,mat,n);   
		}
		if((cnt/8)>=1)System.out.println(cnt/8);
	}
	
	static int formingSquar(int x,int y,int i,int[][] mat,int n){
		int cnt=0;
		for(int j=0;j<n;j++){
			if(j==i)continue;
			else{
				double d=calDis(x,y,mat[j][0],mat[j][1]);
				int index1=calIndex(x,y,i,j,mat,d,n);
				double hypo=Math.sqrt(2*d*d);
				int index2=calIndex(x,y,i,j,mat,hypo,n);
				boolean t=calDisSame(index2,index1,j,mat,d);
				if(t==true){
				cnt++;		
				}
			}
		}
		return cnt;
	}
	
	static boolean calDisSame(int check,int b,int c,int [][]mat,double d){
		double d1=calDis(mat[check][0],mat[check][1],mat[b][0],mat[b][1]);
		double d2=calDis(mat[check][0],mat[check][1],mat[c][0],mat[c][1]);
		if(d1==d2){
			if(d1==d)return true;
			else return false;
		}
		else return false;
	}
	
	static double calDis(int a,int b,int c,int d){
		int d1=c-a;
		int d2=d-b;
		int sqr=(d1*d1) +(d2*d2);
		return(Math.sqrt(sqr));
 	}
	
	static int calIndex(int x,int y,int i,int j,int[][] mat,double d,int n){
		for(int k=0;k<n;k++){
			if(k==i||k==j)continue;
			double dc=calDis(x,y,mat[k][0],mat[k][1]);
			if(dc==d){
				return k;
			}
		}
		return i;
	}
}