import java.util.*;
class Binary{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);	
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int a=s.nextInt();
			ArrayList<Integer> list=new ArrayList<Integer>();
			printBinary(a,list);
			System.out.println();
		}
	}
	
	static void printBinary(int a,ArrayList<Integer> list){
		int t=a;
		while(t!=0){
				list.add(t%2);
		}
				t=t/2;
		int ls=list.size();
		for(int i=0;i<ls;i++){
			System.out.print(list.get(i)+" ");
		}
	}
}