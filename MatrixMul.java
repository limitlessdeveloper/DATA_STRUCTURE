import java.util.*;
class MatrixMul
{
	public static void main(String []args)
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of two matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int f=0;f<2;f++)
		{
			for(int e=0;e<2;e++)
			{
				System.out.print(c[f][e]+" ");
			}
			System.out.println();
		}
	}
}