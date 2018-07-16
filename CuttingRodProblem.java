import java.util.*;

class CuttingRodProblem{
	
		static int r[]=new int[11];
		static int loop[]=new int[11];
	
	public static void main(String []args){
		int price[]=new int[11];
			
		System.out.println("enter the price of each length");
		Scanner s=new Scanner(System.in);
		for(int i=1;i<11;i++){
			System.out.println("Enter the price of "+i+" inch ");
			price[i]=s.nextInt();
			r[i]=0;
		}
		
		rodprice(price);
		print();
		
	}
	
	static int[] rodprice(int[] p){
		int q;
		for(int j=1;j<11;j++){
			 q=0;
			for(int i=1;i<=j;i++){
				if(q<(p[i]+r[j-i])){
					q=p[i]+r[j-i];
					loop[j]=i;
				}
			}
			r[j]=q;
		}
		return r;
	}
	
	static void print(){
		System.out.print("length ");
		for(int i=0;i<11;i++) System.out.print(i+" ");
		System.out.println();
		System.out.print("Optimium Price peace vise ");
		for(int i=0;i<11;i++) System.out.print(r[i]+" ");
		System.out.println();
		System.out.print("piece Size ");
		for(int i=0;i<11;i++) System.out.print(loop[i]+" ");
	}
}