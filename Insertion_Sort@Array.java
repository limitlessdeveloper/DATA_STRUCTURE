import java.util.*;
class Sample{
		
 public static void main(String [] args) 
 {
		int a[]={5,2,3,6,4,7,9};
	
		for(int i=1;i<a.length;i++){
			int v=a[i];
			int j=i-1;
			while(j>=0&&v<a[j]){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=v;
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
 }
	

}