import java.util.*;
class Cinema{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int arr[]=new int[6];
			for(int j=0;j<6;j++){
				arr[j]=s.nextInt();
			}
			totalSeatOccupied(arr);
		}
	}
	
	static void totalSeatOccupied(int arr[]){					// Array arguments can be given in any way (int []a),(int a[]) or (int[] a) are all correct.
	   int cinema[][]=new int[arr[0]][arr[1]];
	   fillMatrix(cinema,arr[0],arr[1],arr[3],1);
	   fillMatrix(cinema,arr[0],arr[1],arr[4],2);
	   fillMatrix(cinema,arr[0],arr[1],arr[5],3);
	   fillMatrix(cinema,arr[0],arr[1],arr[2],-1);
		
		int cnt=0;
		for(int i=0;i<arr[0];i++){
			for(int j=0;j<arr[1];j++){
				if(cinema[i][j]!=0)cnt++;
			}
		}
		System.out.println(cnt);
	   
	}
	
	static void fillMatrix(int cinema[][],int r,int c,int n,int seat){
		
		
		if(seat==1){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					if(n==0)break;
					cinema[i][j]=seat;
					n--;
				}
				if(n==0)break;
			}
		}
		if(seat==2){
			for(int i=0;i<r;i++){
				for(int j=c-1;j>0;j--){
					if(cinema[i][j]==0){
						if(n==0)break;
						cinema[i][j]=seat;
						n--;
					}
				}
				if(n==0)break;				
			}
		}
		
		if(seat==3){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					if(j==0){
							if(c>1){
								if(cinema[i][j+1]!=1 && cinema[i][j]==0){
									if(n==0)break;
									cinema[i][j]=seat;
									n--;
									//System.out.println("point here "+n+" i = "+i+" j = "+ j);
								}
							}
					}
					else if(j==c-1){
								if(n==0)break;
							if(cinema[i][j-1]!=2 && cinema[i][j]==0 ){
								cinema[i][j]=seat;
							System.out.println("point here "+n+" i = "+i+" j = "+ j);
								//System.out.println("point here "+n+" i = "+i+" j = "+ j);
								n--;
							}
						}
					else{
						if(cinema[i][j-1]!=2 && cinema[i][j+1]!=1 && cinema[i][j]==0 && cinema[i][j-1]!=3 ){
							if(n==0)break;
							cinema[i][j]=seat;
							n--;
						}
					}
				}
				if(n==0)break;				
			}
		}
		if(seat==-1){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					if(cinema[i][j]==0){
						if(n==0)break;
						cinema[i][j]=-1;
						n--;
					}
				}
				if(n==0)break;
			}
		}
	}
}