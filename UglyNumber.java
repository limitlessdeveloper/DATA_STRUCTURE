	import java.util.*;
	class UglyNumber{
		public static void main(String []args){
			Scanner s =new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++){
				int n=s.nextInt();
				findUgly(n);
			}
		}
		
		static void findUgly(int n){
			int i=1;
			int cnt=0;
			while(cnt!=n){
				cnt=cnt+findSatisfied(i);
				i++;
			}
			if(cnt==n) System.out.println("The "+n+"th ugly no. is "+(i-1));
		}
		
		static int findSatisfied(int i){
			 int n=checkUgly(i,2);
			 n=checkUgly(n,3);
			 n=checkUgly(n,5);
			 return((n==1||n==0)?1:0);
			
		}
		
		static int checkUgly(int no,int h){
			while(no%h==0){
				no=no/h;
			}
			return no;
		}
		
	}