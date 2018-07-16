import java.util.*;
import java.lang.*;
class BigNumAdd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number 1");
		String s1=new String();
		s1=s.next();
		int l1=s1.length();
		System.out.println("enter the number 2");
		String s2=new String();
		s2=s.next();
		int l2=s2.length();
		int a1[]=new int[l1];
		int a2[]=new int[l2];
		int al;
		if(l1>l2) al=l1;
		else al=l2;
		int a3[]=new int[al+1];
		int x=l1-1;
				
		int y=l2-1;
		
		for(int i=0;i<l1;i++)
		{
		a1[x-i]=Integer.parseInt(Character.toString(s1.charAt(i)));//IMPORTENT
		}	
		for(int j=0;j<l2;j++)
		{
		a2[y-j]=Integer.parseInt(Character.toString(s2.charAt(j)));
		}
		int q=0;
		int w=0;
		int i=0;
		while(q<=x&&w<=y)
		{
			int r=a1[q]+a2[w];
			if(r>9)
			{
					a3[i]=a3[i]+r%10;
					a3[i+1]=a3[i+1] + r/10;
			}
			else
			{
				a3[i]=a3[i]+r%10;
			}
			i++;q++;w++;
		}
		
		if(q>x)
		{
			while(w<=y){
			a3[i]=a3[i]+a2[w];
			w++;i++;
			}
		}
		if(w>y)
		{
			while(q<=x)
			{
				a3[i]=a3[i]+a1[q];
				q++;
				i++;
			}
		}
		for(int r=0;r<=i;i++)System.out.print(a3[i-r]);
	}
}
		// for(int h=0;h<l1;h++)
		// {
			// System.out.print(a1[h]);
		// }
		// System.out.println();
		// for(int p=0;p<l2;p++)
		// {
		// System.out.print(a2[p]);	
		// }