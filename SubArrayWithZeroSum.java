import java.util.*;
class SubArray{
	public static void main(String []args){
		int a[]={6,3,-1,-3,4,-2,2,4,6,-12,-7};
		for(int i=0;i<a.length;i++){
			int total=0;
			for(int j=i;j<a.length;j++){
				total=total+a[j];
				if(total==0){
					System.out.println("the SubArray found from index "+i+" to "+j);
				}
			}
		}
		
	}
}