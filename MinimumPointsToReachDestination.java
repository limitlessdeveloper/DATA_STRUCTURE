import java.util.*;

class Sample{
	public static void main(String []args){
		int arr[][]={{-2,-3,3},{-5,-10,1},{10,30,-5}};
		int i=0,j=0,minval,finalans=0;
		if(arr[0][0]<=0){
			minval=-(arr[0][0]);
			System.out.println(minval);
			finalans=minval+1;
		}
		else minval=arr[0][0];
	while(i<3 && j<3){
		//System.out.println("Point here");
			int b=-9999,c=-999;
			if(j!=2)
			 b=(minval+arr[i][j+1]);
			if(i!=2)
			 c=(minval+arr[i+1][j]);
			if(i==2 && j==2) break;
			int a=max(b,c);
			if(a==b){
				if (a<=0){
					System.out.println(a);
					minval=0;
					finalans= finalans+(-(a))+1;
					System.out.println("f "+finalans);
				}
				else{
					minval=a;
					System.out.println(a);
				}
				j++;
			}
			else{
				if (a<=0){
					System.out.println(a);
					minval=0;
					finalans= finalans+(-(a))+1;
					System.out.println("f "+finalans);
				}else {
					minval=a;
					System.out.println(a);
				}
				i++;
			}
		}
		
		System.out.print("Minimum Points Required is : "+finalans);
	}
	
	static int max(int a,int b){
		if(a>b) return a;
		else return b;
	}
}