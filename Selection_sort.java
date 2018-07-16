import java.util.*;
class Sample{
	public static void main(String []args){
		int a[]={4,2,3,6,9,7,8,1};
		int l=a.length;
		int min,in;
			for(int i=0;i<l;i++){
				min=a[i];
				in=i;
				for(int j=i;j<l;j++){
					if(min>a[j]) {
						min=a[j];
						in=j;
					}
				}
				System.out.println("Point here "+ min);
				int temp=a[in];
					a[in]=a[i];
					a[i]=temp;
			}
		for(int i=0;i<l;i++){
			System.out.print(a[i]+" ");
		}
	}
}