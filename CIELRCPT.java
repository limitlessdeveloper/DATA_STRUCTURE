import java.util.*;
class Cielrcpt{
		public static void main(String []args){
			int menu[]={1,2,4,8,16,32,64,128,256,512,1024,2048};
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++){
				int a=s.nextInt();
				minMenu(a,menu);		
			}
		}
		
	static void minMenu(int a,int[] menu){
		int total=a,cnt=0,i=0;
		while(i<12){
						
				if(total==menu[i]){
					cnt++;
					total=(total-menu[i]);
					break;
				}
				if(i>0){
					if(total<menu[i]){
						cnt++;
						total=total-menu[i-1];
						i=-1;
					}
				}
				if(total==0)break;
				i++;
		}
		System.out.println(cnt);
	}
}