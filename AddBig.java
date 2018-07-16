import java.util.*;
import java.lang.*;
import java.io.*;
class AddBig
{
	public static void main(String args[])
	{
		String s1="9999999";
		String s2="1111";
		String s3="\0";
		int l1=s1.length();
		int l2=s2.length();
		int l,x=0,r,lg,ls;
		if(l1>l2){lg=l1;ls=l2;}
		else {lg=l2;ls=l1;}
		l=lg;
		for(int i=0;i<=l;i++)
		{
			int v1,v2;
			if(i<=ls)
			{
			 v1=Character.getNumericValue(s1.charAt(i));
			 v2=Character.getNumericValue(s2.charAt(i));				
			}
			else 
			{
				if(l1>l2){
			 v1=Character.getNumericValue(s1.charAt(i));
			v2=0;			}
				else
				{
					v2=Character.getNumericValue(s2.charAt(i));
					v1=0;
				}
			}
			if(x>0){r=v1+v2+x;x=0;}
			else r=v1+v2;
			if(r>9){s3=s3+r%10;x=r/10;}
			else s3=s3+r%10;
			
		}
	}
} 