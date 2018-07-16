import java.util.*;
import java.lang.*;
class Sample{
		
public static void main(String [] args) 
    {	
		int a[]={3, 16, 6, 2, 5, 6, 5, 6, 6, 5, 16, 8, 3};
		int x=3;
		int y=6;
		int min_dist=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				//System.out.println(a[j]+" "+a[i]);
				if((a[i]==x&&a[j]==y||a[i]==y&&a[j]==x) && Math.abs(i-j)<min_dist){
					min_dist=Math.abs(i-j);
				}
			}
		}
		System.out.println(min_dist);
	}
	

}