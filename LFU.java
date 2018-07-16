import java.util.*;
class LFU{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		public int f[][]=new int[5][2];
		for(int i=0;i<10;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<5;i++){
			if(i==4){
				f[i][0]=7;
				f[i][1]=0;
				break;
			}
			f[i][0]=i+1;
			f[i][1]=0;
		}
		int p[]=new int[3];
		for(int i=0;i<10;i++){
			if(check(a[i],p)){
				increase(a[i],f);
				continue;
			}
			else{
				int lfvalue=checklf(p,f);
			}
		}
	}
	
	static boolean check(int x,int[] t){
		for(int i=0;i<t.length;i++){
			if(p[i]==x){
				return true;
			}
		}
		return false;
	}
	
	static void increase(int x,int[][] t){
		for(int i=0;i<5;i++){
			if(a[i][0]==x){
				t[i][1]+=1;
			}
		}
	}
	
	static int checklf(int[] p,int[][] f){
		int flag=1;
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
					flag=f[i][1];
				if(p[i]==f[i][0]){
				}
			}
		}
	}
}